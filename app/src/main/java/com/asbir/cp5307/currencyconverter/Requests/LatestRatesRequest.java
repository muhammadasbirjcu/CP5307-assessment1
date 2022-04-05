package com.asbir.cp5307.currencyconverter.Requests;

import android.content.Context;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.asbir.cp5307.currencyconverter.Responses.LatestRatesResponse;

import java.util.HashMap;
import java.util.Map;

public class LatestRatesRequest extends RequestBase {

    protected String baseCurrency;
    protected String[] symbols;

    public LatestRatesRequest(String baseCurrency, String[] symbols){
        super();
        this.baseCurrency = baseCurrency;
        this.symbols = symbols;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    @Override
    public String getUrl() {
        return "latest";
    }

    @Override
    public int getMethod() {
        return Request.Method.GET;
    }

    @Override
    public Map<String, String> getAdditionalQueryString() {
        Map<String,String> qsMap = new HashMap<>();
        qsMap.put("base", getBaseCurrency());
        qsMap.put("symbols", String.join(",", getSymbols()));
        return qsMap;
    }
}
