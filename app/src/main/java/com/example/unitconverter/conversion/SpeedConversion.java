package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class SpeedConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Kilometre/Second":
                switch (secondUnit){
                    case "Kilometre/Second":
                        result = number;
                        break;
                    case "Mile/Hour":
                        result = number*2_236.936;
                        break;
                    case "Inch/Second":
                        result = number*39_370.079;
                        break;
                    case "Metre/Second":
                        result = number*1000;
                        break;
                    case "Kilometre/Hour":
                        result = number*3600;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Mile/Hour":
                switch (secondUnit){
                    case "Kilometre/Second":
                        result = number/2236.936;
                        break;
                    case "Mile/Hour":
                        result = number;
                        break;
                    case "Inch/Second":
                        result = number*17.6;
                        break;
                    case "Metre/Second":
                        result = number/2.236936;
                        break;
                    case "Kilometre/Hour":
                        result = number*1.6093;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Inch/Second":
                switch (secondUnit){
                    case "Kilometre/Second":
                        result = number/39_370.079;
                        break;
                    case "Mile/Hour":
                        result = number/17.6;
                        break;
                    case "Inch/Second":
                        result = number;
                        break;
                    case "Metre/Second":
                        result = number/39.37;
                        break;
                    case "Kilometre/Hour":
                        result = number/10.9361;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Metre/Second":
                switch (secondUnit){
                    case "Kilometre/Second":
                        result = number/1000;
                        break;
                    case "Mile/Hour":
                        result = number*2.236936;
                        break;
                    case "Inch/Second":
                        result = number*39.37;
                        break;
                    case "Metre/second":
                        result = number;
                        break;
                    case "Kilometre/Hour":
                        result = number*3.6;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Kilometre/Hour":
                switch (secondUnit){
                    case "Kilometre/Second":
                        result = number/3600;
                        break;
                    case "Mile/Hour":
                        result = number/1.6093;
                        break;
                    case "Inch/Second":
                        result = number*10.9361;
                        break;
                    case "Metre/Second":
                        result = number/3.6;
                        break;
                    case "Kilometre/Hour":
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
