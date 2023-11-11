package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class WeightConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Gram":
                switch (secondUnit){
                    case "Gram":
                        result = number;
                        break;
                    case "Kilogram":
                        result = number/1000;
                        break;
                    case "Quintal":
                        result = number/100_000;
                        break;
                    case "Tonne":
                        result = number/1_000_000;
                        break;
                    case "Ounce":
                        result = number/28.3495;
                        break;
                    case "Pound":
                        result = number/453.59;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Kilogram":
                switch (secondUnit){
                    case "Gram":
                        result = number*1000;
                        break;
                    case "Kilogram":
                        result = number;
                        break;
                    case "Quintal":
                        result = number/100;
                        break;
                    case "Tonne":
                        result = number/1000;
                        break;
                    case "Ounce":
                        result = number*35.2739;
                        break;
                    case "Pound":
                        result = number*2.2;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Quintal":
                switch (secondUnit){
                    case "Gram":
                        result = number*100_000;
                        break;
                    case "Kilogram":
                        result = number*100;
                        break;
                    case "Quintal":
                        result = number;
                        break;
                    case "Tonne":
                        result = number/10;
                        break;
                    case "Ounce":
                        result = number*3527.39619;
                        break;
                    case "Pound":
                        result = number*220.46;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Tonne":
                switch (secondUnit){
                    case "Gram":
                        result = number*1_000_000;
                        break;
                    case "Kilogram":
                        result = number*1000;
                        break;
                    case "Quintal":
                        result = number*10;
                        break;
                    case "Tonne":
                        result = number;
                        break;
                    case "Ounce":
                        result = number*35_273.9619;
                        break;
                    case "Pound":
                        result = number*2204.6;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Ounce":
                switch (secondUnit){
                    case "Gram":
                        result = number*28.349;
                        break;
                    case "Kilogram":
                        result = number/35.2739;
                        break;
                    case "Quintal":
                        result = number/3527.39619;
                        break;
                    case "Tonne":
                        result = number/35_273.9619;
                        break;
                    case "Ounce":
                        result = number;
                        break;
                    case "Pound":
                        result = number/16;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Pound":
                switch (secondUnit){
                    case "Gram":
                        result = number*453.59;
                        break;
                    case "Kilogram":
                        result = number/2.2;
                        break;
                    case "Quintal":
                        result = number/220.46;
                        break;
                    case "Tonne":
                        result = number/2204.6;
                        break;
                    case "Ounce":
                        result = number*16;
                        break;
                    case "Pound":
                        result = number;
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
        return String.valueOf(result);
    }
}
