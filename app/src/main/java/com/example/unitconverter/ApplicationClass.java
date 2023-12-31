package com.example.unitconverter;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<ListItems> listItems;

    public final static String[] lengthUnit = {"Kilometre","Metre","Centimetre",
             "Yard","Foot","Mile","Inch"};

    public final static String[] areaUnit = {"Square Kilometre","Square Metre","Hectare","Acre","Square Mile",
            "Square Yard","Square Foot","Square Inch"};

    public final static String[] volumeUnit = {"Cubic Metre","Cubic Centimetre","Litre","Cubic Foot","Cubic Yard","Cubic Inch",};

    public final static String[] speedUnit = {"Kilometre/Second","Mile/Hour","Inch/Second","Metre/Second","Kilometre/Hour"};

    public final static String[] weightUnit = {"Gram","Kilogram","Quintal","Tonne","Ounce","Pound"};
    public final static String[] temperatureUnit ={"Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"};

    public final static String[] powerUnit = {"Watt","Kilowatt","Joule/Second","Horse Power","Kilocalorie/Second"};

    public final static String[] pressureUnit = {"Bar","Pascal","Standard atmosphere","Pounds/Square Inch","Torr"};
    @Override
    public void onCreate() {
        super.onCreate();
        listItems = new ArrayList<>();
        listItems.add(new ListItems("Length",1));
        listItems.add(new ListItems("Area",2));
        listItems.add(new ListItems("Volume",3));
        listItems.add(new ListItems("Speed",4));
        listItems.add(new ListItems("Weight",5));
        listItems.add(new ListItems("Temperature",6));
        listItems.add(new ListItems("Power",7));
        listItems.add(new ListItems("Pressure",8));
    }
}
