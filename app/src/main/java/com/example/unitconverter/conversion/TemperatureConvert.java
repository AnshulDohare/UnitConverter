package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class TemperatureConvert {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context){
        double res;
        if(input.isEmpty()||input.equals(".")){
            return "";
        }
        double number = Double.parseDouble(input);


        switch (firstUnit) {
            case "Celsius":
                switch (secondUnit) {
                    case "Celsius":
                        res = number;
                        break;
                    case "Fahrenheit":
                        res = number * (9 / 5.0) + 32;
                        break;
                    case "Kelvin":
                        res = number + 273.15;
                        break;
                    case "Rankine":
                        res = (number * 9 / 5) + 491.67;
                        break;
                    case "Reaumur":
                        res = number * 0.8;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Fahrenheit":
                switch (secondUnit) {
                    case "Celsius":
                        res = (number - 32) * 5 / 9;
                        break;
                    case "Fahrenheit":
                        res = number;
                        break;
                    case "Kelvin":
                        res = ((number - 32) * 5 / 9) + 273.15;
                        break;
                    case "Rankine":
                        res = number + 459.67;
                        break;
                    case "Reaumur":
                        res = (number - 32) * 4 / 9;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Kelvin":
                switch (secondUnit) {
                    case "Celsius":
                        res = number - 273.15;
                        break;
                    case "Fahrenheit":
                        res = (number - 273.15) * 9 / 5 + 32;
                        break;
                    case "Kelvin":
                        res = number;
                        break;
                    case "Rankine":
                        res = number * 1.8;
                        break;
                    case "Reaumur":
                        res = (number - 273.15) * 0.8;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Rankine":
                switch (secondUnit) {
                    case "Celsius":
                        res = (number - 32 - 459.67) / 1.8;
                        break;
                    case "Fahrenheit":
                        res = number - 459.67;
                        break;
                    case "Kelvin":
                        res = number / 1.8;
                        break;
                    case "Rankine":
                        res = number;
                        break;
                    case "Reaumur":
                        res = (number - 32 - 459.67) / 2.25;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Reaumur":
                switch (secondUnit) {
                    case "Celsius":
                        res = number * 1.25;
                        break;
                    case "Fahrenheit":
                        res = (number * 2.25) + 32;
                        break;
                    case "Kelvin":
                        res = (number * 1.25) + 273.15;
                        break;
                    case "Rankine":
                        res = (number * 2.25) + 459.67 + 32;
                        break;
                    case "Reaumur":
                        res = number;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            default:
                Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                return "";
        }
        return String.valueOf(res);
    }

}
