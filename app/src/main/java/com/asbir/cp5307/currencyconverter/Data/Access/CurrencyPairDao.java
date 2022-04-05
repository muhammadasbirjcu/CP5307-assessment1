package com.asbir.cp5307.currencyconverter.Data.Access;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.asbir.cp5307.currencyconverter.Data.Entities.CurrencyPair;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Dao
public interface CurrencyPairDao {
    @Query("SELECT * FROM currency_pair")
    Flowable<List<CurrencyPair>> getAll();

    @Query("SELECT * FROM currency_pair WHERE base_currency = :baseCurrency AND paired_currency = :pairCurrency")
    Flowable<List<CurrencyPair>> loadByPair(String baseCurrency, String pairCurrency);

    @Insert
    void insertAll(CurrencyPair... currencyPairs);

    @Delete
    void delete(CurrencyPair currencyPair);
}
