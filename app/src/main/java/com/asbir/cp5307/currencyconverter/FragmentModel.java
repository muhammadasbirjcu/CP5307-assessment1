package com.asbir.cp5307.currencyconverter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.asbir.cp5307.currencyconverter.ViewModels.AppViewModel;

public class FragmentModel extends Fragment {

    protected AppViewModel model;

    public void loadModel() {
        model = new ViewModelProvider(getActivity()).get(AppViewModel.class);
    }
}
