package com.asbir.cp5307.currencyconverter.Responses;

import org.json.JSONException;
import org.json.JSONObject;

public interface JSONObjectParsable {
    public void parse(JSONObject jsonObj) throws JSONException;
}
