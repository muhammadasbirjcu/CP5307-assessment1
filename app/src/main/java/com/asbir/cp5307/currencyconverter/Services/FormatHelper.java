package com.asbir.cp5307.currencyconverter.Services;

import android.util.Log;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatHelper {
    public static String asCurrency(Double value, String defaultResult) {
        if(value == null) {
            return defaultResult;
        }else{
            return (new DecimalFormat("###,###,##0.00")).format(value);
        }

    }

    public static String asDateTime(Integer epoch, String defaultResult) {
        if(epoch == null){
            return defaultResult;
        }else if(epoch <= 0){
            return defaultResult;
        }else{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, hh:mm:ssa");
            Date date = new Date(epoch * 1000L);
            return simpleDateFormat.format(date);
        }

    }
}
