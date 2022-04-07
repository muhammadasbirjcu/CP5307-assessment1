package com.asbir.cp5307.currencyconverter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Room;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.asbir.cp5307.currencyconverter.Data.Database.CurrencyConverterDatabase;
import com.asbir.cp5307.currencyconverter.Data.Entities.CurrencyPair;
import com.asbir.cp5307.currencyconverter.Requests.LatestRatesRequest;
import com.asbir.cp5307.currencyconverter.Responses.LatestRatesResponse;
import com.asbir.cp5307.currencyconverter.Services.FormatHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends ActivityModel {
    CurrencyConverterDatabase db;
    SymbolSelector selectorBase;
    SymbolSelector selectorPair;
    RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // database
        db = Room.databaseBuilder(getApplicationContext(),
                CurrencyConverterDatabase.class, "curconverter").build();

        // volley queue
        queue = Volley.newRequestQueue(this);
        queue.start();

        // view models
        loadModel();
        model.loadSymbols();
        model.selectBaseCode("USD");
        model.selectConvertedCode("AUD");
        initInputs();

        // inflate fragments
        selectorBase = buildSymbolSelectors(R.id.fcvSymbolBase, model.getSymbolBase().getValue().getCode());
        selectorPair = buildSymbolSelectors(R.id.fcvSymbolPair, model.getSymbolConverted().getValue().getCode());

        selectorBase.setOnSelected(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                model.selectBase(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        selectorPair.setOnSelected(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                model.selectConverted(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // set listeners
        model.getSymbolBase().observe(this, item -> {
            Log.i("conv", "Changed base: " + model.getSymbolBase().getValue().getCode());
            applyPairUIChanges();
            loadFromDatabase(model.getSymbolBase().getValue().getCode(), model.getSymbolConverted().getValue().getCode());
        });
        model.getSymbolConverted().observe(this, item -> {
            Log.i("conv", "Changed converted: " + model.getSymbolConverted().getValue().getCode());
            applyPairUIChanges();
            loadFromDatabase(model.getSymbolBase().getValue().getCode(), model.getSymbolConverted().getValue().getCode());
        });
        model.getRate().observe(this, item -> {
            applyPairUIChanges();
            convert();
        });
        model.getLastUpdate().observe(this, item -> {
            applyPairUIChanges();
        });

    }


    protected SymbolSelector buildSymbolSelectors(Integer frameContainerResource, String selectedCode) {
        Integer selectedIndex = model.getSymbols().getIndexOf(selectedCode);
        return buildSymbolSelectors(frameContainerResource, selectedIndex);
    }

    protected SymbolSelector buildSymbolSelectors(Integer frameContainerResource, Integer selectedIndex) {
        SymbolSelector fragmentClass = SymbolSelector.newInstance(selectedIndex);
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(frameContainerResource, fragmentClass)
                .commit();
        return fragmentClass;
    }

    protected void applyPairUIChanges() {
        TextView txtBaseCode = findViewById(R.id.txtBaseRateCode);
        txtBaseCode.setText( model.getSymbolBase().getValue().getCode());

        TextView txtPairCode = findViewById(R.id.txtPairRateCode);
        txtPairCode.setText(model.getSymbolConverted().getValue().getCode());

        TextView txtExchangeRate = findViewById(R.id.txtPairRate);
        txtExchangeRate.setText(FormatHelper.asCurrency(model.getRate().getValue(), "N/A"));

        TextView txtLastUpdate = findViewById(R.id.txtLastUpdateTs);
        txtLastUpdate.setText(FormatHelper.asDateTime(model.getLastUpdate().getValue(), "N/A"));
    }

    protected void initInputs() {
        ((EditText)findViewById(R.id.txtBaseValue)).setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(model.getRate().getValue() != null) {
                    convert();
                }
                return false;
            }
        });
    }

    protected void convert(){
        String inputtedString = ((EditText)findViewById(R.id.txtBaseValue)).getText().toString();
        if(inputtedString.isEmpty()){
            return;
        }
        try{
            Double baseValue = Double.valueOf(inputtedString);
            Double convertedValue = model.getRate().getValue() * baseValue;
            ((EditText)findViewById(R.id.txtPairValue)).setText(FormatHelper.asCurrency(convertedValue, "0.00"));
        }catch (Exception ex){
            Log.i("conv", "error in convert", ex);
        }
    }

    protected void promptAlert(String title, String message){
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                //.setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }


    protected void retrieveRate(String base, String converted){
        String requestTag = "conversion";
        Log.i("conv", "api retrieve " + base + " x " + converted);

        // this cancels all existing requests
        queue.cancelAll(requestTag);

        // start building new request
        LatestRatesRequest rates = new LatestRatesRequest(base, new String[]{converted});
        rates.build(new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                LatestRatesResponse resp = new LatestRatesResponse();
                try{
                    resp.parse(response);
                }catch (JSONException ex){
                    Log.i("conv", "api parsing error", ex);
                }
                if(resp.getRates().size() > 0){
                    storeToDatabase(resp.getRates().values().toArray(new CurrencyPair[0])[0]);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                promptAlert("API Error", "Unable to retrieve the latest rate for " + base + " x " + converted);
                Log.i("conv", "api error", error);
            }
        });
        rates.setTag(requestTag);

        queue.add(rates.getRequest());
    }

    protected void loadFromDatabase(String base, String converted) {
        Log.i("conv", "db select " + base + " x " + converted);
        db.currencyPairDao().loadByPair(base, converted)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(existingPair -> {
                    if(existingPair != null){
                        // apply to UI
                        Log.i("conv", "db select found");
                        model.applyCurrencyPair(existingPair);
                    }
                }, error -> {
                    Log.i("conv", "db select error", error);
                    promptAlert("Database Error", "Unable to load stored rate for " + base + " x " + converted);

                }, () -> {
                    Log.i("conv", "db select not found");
                    retrieveRate(base, converted);
                });
    }

    protected void storeToDatabase(@NonNull CurrencyPair pair) {
        Log.i("conv", "db insert " + pair.getBase() + " x " + pair.getPair());
        db.currencyPairDao().insert(pair)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(() -> {
                // apply to UI
                Log.i("conv", "db inserted " + pair.getRate());
                model.applyCurrencyPair(pair);
            }, error -> {
                promptAlert("Database Error", "Unable to save the rate for " + pair.getBase() + " x " + pair.getPair());
                Log.i("conv", "insert error", error);

            });



    }
}