package com.asbir.cp5307.currencyconverter.Requests;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.Nullable;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public abstract class RequestBase {
    protected String baseUrl;
    protected String apiKey;
    protected JsonObjectRequest request;

    RequestBase(){
        baseUrl = "https://api.exchangeratesapi.io/v1/";
        apiKey = "c1c9034e579a8d045cb991d6c16464a4";

    }

    public JsonObjectRequest getRequest(){
        return request;
    }

    /***
     * Returns relative URL of the request
     * @return
     */
    public abstract String getUrl();

    /***
     * Method of the URL. GET, POST, PUT
     * @return
     */
    public abstract int getMethod();

    /***
     * Query string to be appended to the url
     * @return
     */
    public abstract Map<String, String> getAdditionalQueryString();

    /***
     * The full query string to be appended to the url
     * @return
     */
    public Map<String, String> getQueryString() {
        Map<String,String> qsMap = new HashMap<String,String>();
        qsMap.put("access_key", apiKey);
        if(getAdditionalQueryString() != null){
            for (Map.Entry<String,String> entry : getAdditionalQueryString().entrySet()) {
                qsMap.put(entry.getKey(), entry.getValue());
            }
        }
        return qsMap;
    }

    public JSONObject jsonPayload(){
        return null;
    }

    /***
     * Merged base url, relative url and query string
     * @return
     */
    public String fullUrl(){
        if(getQueryString() == null){
            return baseUrl + getUrl();
        }else{
            Uri.Builder builder = Uri.parse(baseUrl + getUrl()).buildUpon();
            for (Map.Entry<String,String> entry : getQueryString().entrySet()){
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return builder.build().toString();
        }
    }

    public void build(Response.Listener<JSONObject> listener,
                     @Nullable Response.ErrorListener errorListener) {
        Log.i("conv", fullUrl());

        request = new JsonObjectRequest(getMethod(), fullUrl(), jsonPayload(), listener, errorListener){
//            @Override
//            public Map getHeaders() throws AuthFailureError
//            {
//                HashMap headers = new HashMap();
//                headers.put("Content-Type", "application/json");
//                headers.put("apiKey", "xxxxxxxxxxxxxxx");
//                return headers;
//            }
//
//            protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("param1", num1);
//                params.put("param2", num2);
//                return params;
//            };
        };
    }
}
