package com.example.unitconverter;

import android.content.Context;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TemperatureConvert {
    DecimalFormat df = new DecimalFormat("#.####");
    public double conversion(String firstUnit, String SecondUnit, String input, Context context){
        double calculate;
        double res = 0;
        if(input.isEmpty()){
            return res;
        }
        double number = Double.parseDouble(input);


        if(firstUnit.equals("Celsius")){
            switch (SecondUnit){
                case "Celsius":
                    res = number ;
                    break;
                case "Fahrenheit":
                    calculate = number * (9 / 5.0) + 32;
                    res = Double.parseDouble(df.format(calculate));
                    break;
                case "Kelvin":
                    calculate = number + 273.15;
                    res = Double.parseDouble(df.format(calculate));
                    break;
                case "Rankine":
                    calculate = (number * 9 / 5) + 491.67;
                    res = Double.parseDouble(df.format(calculate));
                    break;
                case "Reaumur":
                    calculate = number * 0.8;
                    res = Double.parseDouble(df.format(calculate));
                    break;
                default:
                    Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                    return res;
            }
        }
        return  res;

    }

}
