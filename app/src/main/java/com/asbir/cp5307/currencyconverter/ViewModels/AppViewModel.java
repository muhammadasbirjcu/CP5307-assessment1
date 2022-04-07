package com.asbir.cp5307.currencyconverter.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.asbir.cp5307.currencyconverter.Data.Entities.CurrencyPair;
import com.asbir.cp5307.currencyconverter.Services.Symbol;
import com.asbir.cp5307.currencyconverter.Services.SymbolsArray;
import com.asbir.cp5307.currencyconverter.Services.SymbolsMap;

public class AppViewModel extends ViewModel {
    protected SymbolsArray symbols;
    protected MutableLiveData<Symbol> symbolBase;
    protected MutableLiveData<Symbol> symbolConverted;
    protected MutableLiveData<Double> rate;
    protected MutableLiveData<Integer> lastUpdate;


    public AppViewModel(){
        symbolBase = new MutableLiveData<>();
        symbolConverted = new MutableLiveData<>();
        rate = new MutableLiveData<>();
        lastUpdate = new MutableLiveData<>();
    }

    public void loadSymbols(){
        symbols = SymbolsArray.getSupported();
    }


    public SymbolsArray getSymbols() {
        return symbols;
    }

    public LiveData<Symbol> getSymbolBase() {
        return symbolBase;
    }

    public LiveData<Symbol> getSymbolConverted() {
        return symbolConverted;
    }


    public void selectBase(Integer index) {
        symbolBase.setValue(symbols.get(index));
        rate.setValue(0D);
        lastUpdate.setValue(-1);
    }

    public void selectConverted(Integer index) {
        symbolConverted.setValue(symbols.get(index));
        rate.setValue(0D);
        lastUpdate.setValue(-1);
    }

    public void selectBaseCode(String code) {
        selectBase(symbols.getIndexOf(code));
    }

    public void selectConvertedCode(String code) {
        selectConverted(symbols.getIndexOf(code));
    }

    public MutableLiveData<Double> getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate.setValue(rate);
    }

    public MutableLiveData<Integer> getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate.setValue(lastUpdate);
    }

    public void applyCurrencyPair(CurrencyPair pair) {
        setRate(pair.getRate());
        setLastUpdate(pair.getLastUpdate());
    }
}
