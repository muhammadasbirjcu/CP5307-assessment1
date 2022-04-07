package com.asbir.cp5307.currencyconverter.Services;

public class Symbol {
    protected String code;
    protected String country;
    protected String codeAndCountry;

    public Symbol(String code, String country){
        this.code = code;
        this.country = country;
        this.codeAndCountry = code + " (" + country + ")";
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public String getCodeAndCountry() {
        return codeAndCountry;
    }
}
