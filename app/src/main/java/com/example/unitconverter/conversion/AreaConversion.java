package com.example.unitconverter.conversion;

import android.content.Context;
import android.widget.Toast;

public class AreaConversion {
    public static String conversion(String firstUnit, String secondUnit, String input, Context context) {
        double result;
        if (input.isEmpty()||input.equals(".")) {
            return "";
        }
        double number = Double.parseDouble(input);
        switch (firstUnit){
            case "Square Kilometre":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number;
                        break;
                    case "Square Metre":
                        result = number*1000000;
                        break;
                    case "Hectare":
                        result = number*100;
                        break;
                    case "Acre":
                        result = number*247.105;
                        break;
                    case "Square Mile":
                        result = number*0.386102;
                        break;
                    case "Square Yard":
                        result = number*1_195_990;
                        break;
                    case "Square Foot":
                        result = number*10_763_910.4;
                        break;
                    case "Square Inch":
                        result = number*1_550_003_100;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Square Metre":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number*0.000001;
                        break;
                    case "Square Metre":
                        result = number;
                        break;
                    case "Hectare":
                        result = number*0.0001;
                        break;
                    case "Acre":
                        result = number*0.000247105;
                        break;
                    case "Square Mile":
                        result = number*3.86102159;
                        break;
                    case "Square Yard":
                        result = number*1.19599;
                        break;
                    case "Square Foot":
                        result = number*10.7639104;
                        break;
                    case "Square Inch":
                        result = number*1_550.0031;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Hectare":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number*0.01;
                        break;
                    case "Square Metre":
                        result = number*10000;
                        break;
                    case "Hectare":
                        result = number;
                        break;
                    case "Acre":
                        result = number*2.47105;
                        break;
                    case "Square Mile":
                        result = number*0.00386102;
                        break;
                    case "Square Yard":
                        result = number*11959.9;
                        break;
                    case "Square Foot":
                        result = number*107_639.104;
                        break;
                    case "Square Inch":
                        result = number*15_500_031;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Acre":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number/247.105;
                        break;
                    case "Square Metre":
                        result = number*4_046.9445568;
                        break;
                    case "Hectare":
                        result = number/2.47105;
                        break;
                    case "Acre":
                        result = number;
                        break;
                    case "Square Mile":
                        result = number*0.0015625;
                        break;
                    case "Square Yard":
                        result = number*4_840.10522;
                        break;
                    case "Square Foot":
                        result = number*43_560.9486;
                        break;
                    case "Square Inch":
                        result = number*6_272_776.60866;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Square Mile":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number*2.59;
                        break;
                    case "Square Metre":
                        result = number*2_590_002.59;
                        break;
                    case "Hectare":
                        result = number*259;
                        break;
                    case "Acre":
                        result = number*639.98963999;
                        break;
                    case "Square Mile":
                        result = number;
                        break;
                    case "Square Yard":
                        result = number*3_097_617.1976;
                        break;
                    case "Square Foot":
                        result = number*27_878_555.8145;
                        break;
                    case "Square Inch":
                        result = number*4_014_512_043.512;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Square Yard":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number/1_195_990;
                        break;
                    case "Square Metre":
                        result = number/1.19599;
                        break;
                    case "Hectare":
                        result = number/11959.9;
                        break;
                    case "Acre":
                        result = number/4_840.10522;
                        break;
                    case "Square Mile":
                        result = number/3_097_617.1976;
                        break;
                    case "Square Yard":
                        result = number;
                        break;
                    case "Square Foot":
                        result = number*9;
                        break;
                    case "Square Inch":
                        result = number*1296;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Square Foot":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number/10_763_910.4;
                        break;
                    case "Square Metre":
                        result = number/10.7639104;
                        break;
                    case "Hectare":
                        result = number/107_639.104;
                        break;
                    case "Acre":
                        result = number/43_560.9486;
                        break;
                    case "Square Mile":
                        result = number/27_878_555.8145;
                        break;
                    case "Square Yard":
                        result = number/9;
                        break;
                    case "Square Foot":
                        result = number;
                        break;
                    case "Square Inch":
                        result = number*144;
                        break;
                    default:
                        Toast.makeText(context, "Something went wrong, Try Again...", Toast.LENGTH_SHORT).show();
                        return "";
                }
                break;
            case "Square Inch":
                switch (secondUnit){
                    case "Square Kilometre":
                        result = number/1_550_003_100;
                        break;
                    case "Square Metre":
                        result = number/1_550.0031;
                        break;
                    case "Hectare":
                        result = number/15_500_031;
                        break;
                    case "Acre":
                        result = number/6_272_776.60866;
                        break;
                    case "Square Mile":
                        result = number/4_014_512_043.512;
                        break;
                    case "Square Yard":
                        result = number/1296;
                        break;
                    case "Square Foot":
                        result = number/144;
                        break;
                    case "Square Inch":
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
