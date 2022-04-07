package com.asbir.cp5307.currencyconverter.Services;

import android.content.Context;
import android.content.SharedPreferences;

import com.asbir.cp5307.currencyconverter.R;
import com.asbir.cp5307.currencyconverter.Requests.RequestBase;

public class AppSharedPreference {

    protected SharedPreferences sharedPref;
    protected SharedPreferences.Editor editor;

    public AppSharedPreference(Context context, String name, int mode){
        sharedPref = context.getSharedPreferences(name, mode);
        editor = sharedPref.edit();
    }

    public void init(){
        if(retrieveApiKey(null) == null){
            saveApiKey(RequestBase.apiKey());
            apply();
        }
    }

    public void saveBaseCurrency(String code) {
        editor.putString("base_currency", code);
    }

    public void saveConvertedCurrency(String code) {
        editor.putString("converted_currency", code);
    }

    public String retrieveBaseCurrency(String defaultValue) {
        return sharedPref.getString("base_currency", defaultValue);
    }

    public String retrieveConvertedCurrency(String defaultValue) {
        return sharedPref.getString("converted_currency", defaultValue);
    }

    public void saveApiKey(String key) {
        editor.putString("apiKey", key);
    }

    public String retrieveApiKey(String defaultValue) {
        return sharedPref.getString("apiKey", defaultValue);
    }

    public void apply(){
        editor.apply();
    }
}
