package com.asbir.cp5307.currencyconverter.Data.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "currency_pair", primaryKeys = {"base_currency", "paired_currency"})
public class CurrencyPair {

    @ColumnInfo(name = "base_currency")
    @NonNull
    protected String base;

    @ColumnInfo(name = "paired_currency")
    @NonNull
    protected String pair;

    @ColumnInfo(name = "rate")
    protected Double rate;

    @ColumnInfo(name = "last_update")
    protected Integer lastUpdate;

    public CurrencyPair(String base, String pair, Double rate, Integer lastUpdate){
        this.base = base;
        this.pair = pair;
        this.rate = rate;
        this.lastUpdate = lastUpdate;
    }

    public CurrencyPair(){
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

    public void setBase(@NonNull String base) {
        this.base = base;
    }

    public void setPair(@NonNull String pair) {
        this.pair = pair;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Double convert(Double value){
        return value * rate;
    }


}
