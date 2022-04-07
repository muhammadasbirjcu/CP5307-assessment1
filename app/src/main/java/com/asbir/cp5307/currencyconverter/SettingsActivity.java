package com.asbir.cp5307.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.asbir.cp5307.currencyconverter.Data.Database.CurrencyConverterDatabase;
import com.asbir.cp5307.currencyconverter.Services.AppSharedPreference;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SettingsActivity extends ActivityModel {

    AppSharedPreference sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportActionBar().setTitle("Settings");


        // shared preference
        sharedPref = new AppSharedPreference(this, getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        sharedPref.init();

        initData();
    }


    protected void initData(){
        ((EditText)findViewById(R.id.txtApiKey)).setText(sharedPref.retrieveApiKey(""));
    }

    public void onSaveSettingsClicked(View view){
        sharedPref.saveApiKey(((EditText)findViewById(R.id.txtApiKey)).getText().toString());
        sharedPref.apply();


        new MaterialAlertDialogBuilder(this)
                .setTitle("Saved")
                .setMessage("Settings saved")

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

    public void onClearDataClicked(View view){
//        db.currencyPairDao().deleteAll()
//                .subscribeOn(Schedulers.computation())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(() -> {
//
//                    new AlertDialog.Builder(this)
//                            .setTitle("Cleared")
//                            .setMessage("All stored exchange rate were cleared")
//
//                            // Specifying a listener allows you to take an action before dismissing the dialog.
//                            // The dialog is automatically dismissed when a dialog button is clicked.
//                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog, int which) {
//                                    // Continue with delete operation
//                                }
//                            })
//                            // A null listener allows the button to dismiss the dialog and take no further action.
//                            //.setNegativeButton(android.R.string.no, null)
//                            .setIcon(android.R.drawable.ic_dialog_alert)
//                            .show();
//                });
    }
}