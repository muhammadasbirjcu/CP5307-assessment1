package com.asbir.cp5307.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.asbir.cp5307.currencyconverter.ViewModels.AppViewModel;

public class ActivityModel extends AppCompatActivity {

    protected AppViewModel model;

    public void loadModel() {
        model = new ViewModelProvider(this).get(AppViewModel.class);
    }
}
