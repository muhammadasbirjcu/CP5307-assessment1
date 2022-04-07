package com.asbir.cp5307.currencyconverter.Data.Access;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.asbir.cp5307.currencyconverter.Data.Entities.CurrencyPair;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;

@Dao
public interface CurrencyPairDao {
    @Insert
    public Completable insertAll(CurrencyPair... currencyPairs);

    @Delete
    public Completable delete(CurrencyPair currencyPair);

    @Update
    public Completable update(CurrencyPair... currencyPairs);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Completable insert(CurrencyPair currencyPairs);

    @Query("SELECT * FROM currency_pair")
    public Maybe<List<CurrencyPair>> getAll();

    @Query("SELECT * FROM currency_pair WHERE base_currency = :baseCurrency AND paired_currency = :converted")
    public Maybe<CurrencyPair> loadByPair(String baseCurrency, String converted);

    @Query("SELECT * FROM currency_pair WHERE base_currency = :baseCurrency AND paired_currency = (:converted)")
    public Maybe<List<CurrencyPair>> loadByPairs(String baseCurrency, String[] converted);
}
