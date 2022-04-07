package com.asbir.cp5307.currencyconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SymbolSelector#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SymbolSelector extends FragmentModel {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_SELECTED = "SELECTED_INDEX";

    // TODO: Rename and change types of parameters
    private Integer selectedIndex;

    private Spinner spinner;

    private AdapterView.OnItemSelectedListener selectedListener;

    public SymbolSelector() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param selected Selected Index.
     * @return A new instance of fragment SymbolSelector.
     */
    // TODO: Rename and change types and number of parameters
    public static SymbolSelector newInstance(Integer selected) {
        SymbolSelector fragment = new SymbolSelector();
        Bundle args = new Bundle();
        args.putInt(ARG_SELECTED, selected);
        fragment.setArguments(args);
        return fragment;
    }

    protected ArrayList<String> getDataSource() {
        return model.getSymbols().mapCodeAndCountry();
    }

    protected ArrayAdapter<String> getAdapter() {
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, getDataSource());
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        return adapter;
    }

    public void setOnSelected(AdapterView.OnItemSelectedListener onSelected){
        this.selectedListener = onSelected;
        this.applyOnSelected();
    }

    private void applyOnSelected(){
        if(spinner != null){
            spinner.setOnItemSelectedListener(this.selectedListener);
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedIndex = getArguments().getInt(ARG_SELECTED);
        }
        loadModel();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_symbol_selector, container, false);

        // Inflate the layout for this fragment
        spinner = (Spinner) rootView.findViewById(R.id.spSymbolSelector);

        // Apply the adapter to the spinner
        spinner.setAdapter(getAdapter());

        applyOnSelected();

        // Set selected index
        if(selectedIndex != null){
            spinner.setSelection(selectedIndex);
        }


        return rootView;
    }
}