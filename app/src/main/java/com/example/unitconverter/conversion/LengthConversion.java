package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class LengthConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()||input.equals(".")) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Kilometre":
                switch (secondUnit){
                    case "Kilometre":
                        result = number;
                        break;
                    case "Metre":
                        result = number*1000;
                        break;
                    case "Centimetre":
                        result = number*100_000;
                        break;
                    case "Yard":
                        result = number*1093.6132983377;
                        break;
                    case "Foot":
                        result = number*3280.84;
                        break;
                    case "Mile":
                        result = number*0.621371;
                        break;
                    case "Inch":
                        result = number*39370.1;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Metre":
                switch (secondUnit){
                    case "Kilometre":
                        result = number * 0.001;
                        break;
                    case "Metre":
                        result = number;
                        break;
                    case "Centimetre":
                        result = number*100;
                        break;
                    case "Yard":
                        result = number *1.09361;
                        break;
                    case "Foot":
                        result = number*3.28084;
                        break;
                    case "Mile":
                        result = number*0.000621371;
                        break;
                    case "Inch":
                        result = number*39.3701;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Centimetre":
                switch (secondUnit){
                    case "Kilometre":
                        result = number *0.00001;
                        break;
                    case "Metre":
                        result = number*0.01;
                        break;
                    case "Centimetre":
                        result = number;
                        break;
                    case "Yard":
                        result = number *0.0109361;
                        break;
                    case "Foot":
                        result = number *0.0328084;
                        break;
                    case "Mile":
                        result = number *0.000006214;
                        break;
                    case "Inch":
                        result = number *0.393701;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Yard":
                switch (secondUnit){
                    case "Kilometre":
                        result = number *0.0009144;
                        break;
                    case "Metre":
                        result = number *0.9144;
                        break;
                    case "Centimetre":
                        result = number *91.44;
                        break;
                    case "Yard":
                        result = number;
                        break;
                    case "Foot":
                        result = number *3;
                        break;
                    case "Mile":
                        result = number *0.000568182;
                        break;
                    case "Inch":
                        result = number *36;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Foot":
                switch (secondUnit){
                    case "Kilometre":
                        result = number *0.0003048;
                        break;
                    case "Metre":
                        result = number *0.3048;
                        break;
                    case "Centimetre":
                        result = number *30.48;
                        break;
                    case "Yard":
                        result = number *0.333333;
                        break;
                    case "Foot":
                        result = number;
                        break;
                    case "Mile":
                        result = number *0.000189394;
                        break;
                    case "Inch":
                        result = number *12;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Mile":
                switch (secondUnit){
                    case "Kilometre":
                        result = number *1.60934;
                        break;
                    case "Metre":
                        result = number *1609.34;
                        break;
                    case "Centimetre":
                        result = number *160934;
                        break;
                    case "Yard":
                        result = number *1760;
                        break;
                    case "Foot":
                        result = number *5280;
                        break;
                    case "Mile":
                        result = number;
                        break;
                    case "Inch":
                        result = number *63360;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Inch":
                switch (secondUnit){
                    case "Kilometre":
                        result = number *0.0000254;
                        break;
                    case "Metre":
                        result = number *0.0254;
                        break;
                    case "Centimetre":
                        result = number *2.54;
                        break;
                    case "Yard":
                        result = number *0.0277778;
                        break;
                    case "Foot":
                        result = number *0.0833333;
                        break;
                    case "Mile":
                        result = number *0.00001578356;
                        break;
                    case "Inch":
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
