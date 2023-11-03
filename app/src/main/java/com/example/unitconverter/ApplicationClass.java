package com.example.unitconverter;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<ListItems> listItems;
<<<<<<< HEAD
=======
    public final static String[] temperatureUnit ={"Celsius","Fahrenheit","Kelvin","Rankine","Reaumur"};
>>>>>>> 4ce8e24 (Worked on MainActivity2)
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
