package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class PressureConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()||input.equals(".")) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Bar":
                switch (secondUnit){
                    case "Bar":
                        result = number;
                        break;
                    case "Pascal":
                        result = number*100_000;
                        break;
                    case "Standard atmosphere":
                        result = number/1.01325;
                        break;
                    case "Pounds/Square Inch":
                        result = number*14.5038;
                        break;
                    case "Torr":
                        result = number*750.062;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";

                }
                break;
            case "Pascal":
                switch (secondUnit){
                    case "Bar":
                        result = number/100_000;
                        break;
                    case "Pascal":
                        result = number;
                        break;
                    case "Standard atmosphere":
                        result = number/101_325;
                        break;
                    case "Pounds/Square Inch":
                        result = number/6894.76;
                        break;
                    case "Torr":
                        result = number/133.322;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";

                }
                break;
            case "Standard atmosphere":
                switch (secondUnit){
                    case "Bar":
                        result = number*1.01325;
                        break;
                    case "Pascal":
                        result = number*101325;
                        break;
                    case "Standard atmosphere":
                        result = number;
                        break;
                    case "Pounds/Square Inch":
                        result = number*14.6959;
                        break;
                    case "Torr":
                        result = number*760;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";

                }
                break;
            case "Pounds/Square Inch":
                switch (secondUnit){
                    case "Bar":
                        result = number/14.5038;
                        break;
                    case "Pascal":
                        result = number*6894.76;
                        break;
                    case "Standard atmosphere":
                        result = number/14.6959;
                        break;
                    case "Pounds/Square Inch":
                        result = number;
                        break;
                    case "Torr":
                        result = number*51.7149;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";

                }
                break;
            case "Torr":
                switch (secondUnit){
                    case "Bar":
                        result = number/750.062;
                        break;
                    case "Pascal":
                        result = number*133.322;
                        break;
                    case "Standard atmosphere":
                        result = number/760;
                        break;
                    case "Pounds/Square Inch":
                        result = number/51.7149;
                        break;
                    case "Torr":
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
