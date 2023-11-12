package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class PowerConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()||input.equals(".")) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Watt":
            case "Joule/Second":
                switch (secondUnit){
                    case "Watt":
                    case "Joule/Second":
                        result = number;
                        break;
                    case "Kilowatt":
                        result = number/1000;
                        break;
                    case "Horse Power":
                        result = number/745.7;
                        break;
                    case "Kilocalorie/Second":
                        result = number/4184.1;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Kilowatt":
                switch (secondUnit){
                    case "Watt":
                    case "Joule/Second":
                        result = number*1000;
                        break;
                    case "Kilowatt":
                        result = number;
                        break;
                    case "Horse Power":
                        result = number*1.341;
                        break;
                    case "Kilocalorie/Second":
                        result = number/4.1841;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Horse Power":
                switch (secondUnit){
                    case "Watt":
                    case "Joule/Second":
                        result = number*745.7;
                        break;
                    case "Kilowatt":
                        result = number/1.341;
                        break;
                    case "Horse Power":
                        result = number;
                        break;
                    case "Kilocalorie/Second":
                        result = number/5.61;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Kilocalorie/Second":
                switch (secondUnit){
                    case "Watt":
                    case "Joule/Second":
                        result = number*4184.1;
                        break;
                    case "Kilowatt":
                        result = number*4.1841;
                        break;
                    case "Horse Power":
                        result = number*5.61;
                        break;
                    case "Kilocalorie/Second":
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
