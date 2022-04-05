package com.asbir.cp5307.currencyconverter.Data.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.asbir.cp5307.currencyconverter.Data.Access.CurrencyPairDao;
import com.asbir.cp5307.currencyconverter.Data.Entities.CurrencyPair;

@Database(entities = {CurrencyPair.class}, version = 1, exportSchema = false)
public abstract class CurrencyConverterDatabase extends RoomDatabase {
    public abstract CurrencyPairDao currencyPairDao();
}
