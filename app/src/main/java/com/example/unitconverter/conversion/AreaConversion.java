package com.example.unitconverter.conversion;

import android.content.Context;

public class AreaConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result=0;
        if (input.isEmpty()) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){

        }
        return String.valueOf(result);
    }
}
