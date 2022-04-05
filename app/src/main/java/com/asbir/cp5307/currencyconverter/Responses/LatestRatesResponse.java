package com.asbir.cp5307.currencyconverter.Responses;

import com.asbir.cp5307.currencyconverter.Core.CurrencyPair;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class LatestRatesResponse extends BaseResponse implements JSONObjectParsable {
    protected String base;
    protected String date;
    protected HashMap<String, CurrencyPair> rates;

    @Override
    public void parse(JSONObject jsonObj)  throws JSONException {
        success = jsonObj.getString("success");
        timestamp = jsonObj.getInt("timestamp");
        base = jsonObj.getString("base");
        date = jsonObj.getString("date");

        rates = new HashMap<>();

        JSONObject ratesJson = jsonObj.getJSONObject("rates");
        Iterator<String> iterator = ratesJson.keys();
        while (iterator.hasNext()) {
            String key = iterator.next();
            try {
                rates.put(key, new CurrencyPair(base, key, ratesJson.getDouble(key), timestamp));
            } catch (JSONException e) {
            }
        }
    }
}
