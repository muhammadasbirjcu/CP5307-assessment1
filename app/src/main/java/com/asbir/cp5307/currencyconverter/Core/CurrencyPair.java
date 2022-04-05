package com.asbir.cp5307.currencyconverter.Core;

public class CurrencyPair {
    protected String base;
    protected String pair;
    protected Double rate;
    protected Integer lastUpdate;

    public CurrencyPair(String base, String pair, Double rate, Integer lastUpdate){
        this.base = base;
        this.pair = pair;
        this.rate = rate;
        this.lastUpdate = lastUpdate;
    }

    public String getBase() {
        return base;
    }

    public String getPair() {
        return pair;
    }

    public Double getRate() {
        return rate;
    }

    public Integer getLastUpdate() {
        return lastUpdate;
    }
}
