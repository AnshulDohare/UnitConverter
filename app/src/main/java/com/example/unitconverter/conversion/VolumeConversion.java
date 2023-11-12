package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class VolumeConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()||input.equals(".")) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Cubic Metre":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number;
                        break;
                    case "Cubic Centimetre":
                        result = number*1000000;
                        break;
                    case "Litre":
                        result = number*1000;
                        break;
                    case "Cubic Foot":
                        result = number*35.3147;
                        break;
                    case "Cubic Yard":
                        result = number*1.30795;
                        break;
                    case "Cubic Inch":
                        result = number*61_023.8445;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Cubic Centimetre":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number/1_000_000;
                        break;
                    case "Cubic Centimetre":
                        result = number;
                        break;
                    case "Litre":
                        result = number*0.001;
                        break;
                    case "Cubic Foot":
                        result = number/28316.8;
                        break;
                    case "Cubic Yard":
                        result = number/764_553.58328;
                        break;
                    case "Cubic Inch":
                        result = number/16.387;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Litre":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number/1000;
                        break;
                    case "Cubic Centimetre":
                        result = number*1000;
                        break;
                    case "Litre":
                        result = number;
                        break;
                    case "Cubic Foot":
                        result = number/28.3168;
                        break;
                    case "Cubic Yard":
                        result = number/764.55358;
                        break;
                    case "Cubic Inch":
                        result = number*61.0238;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Cubic Foot":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number/35.3147;
                        break;
                    case "Cubic Centimetre":
                        result = number*28_316.8;
                        break;
                    case "Litre":
                        result = number*28.3168;
                        break;
                    case "Cubic Foot":
                        result = number;
                        break;
                    case "Cubic Yard":
                        result = number/27;
                        break;
                    case "Cubic Inch":
                        result = number*1_728;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Cubic Yard":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number/1.3079;
                        break;
                    case "Cubic Centimetre":
                        result = number*764_553.58328;
                        break;
                    case "Litre":
                        result = number*764.55358;
                        break;
                    case "Cubic Foot":
                        result = number*27;
                        break;
                    case "Cubic Yard":
                        result = number;
                        break;
                    case "Cubic Inch":
                        result = number*46_655.999;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Cubic Inch":
                switch (secondUnit){
                    case "Cubic Metre":
                        result = number/61_023.8445;
                        break;
                    case "Cubic Centimetre":
                        result = number*16.387;
                        break;
                    case "Litre":
                        result = number/61.0238;
                        break;
                    case "Cubic Foot":
                        result = number/1728;
                        break;
                    case "Cubic Yard":
                        result = number/46_655.999;
                        break;
                    case "Cubic Inch":
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
