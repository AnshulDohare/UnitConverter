package com.example.unitconverter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.unitconverter.conversion.AreaConversion;
import com.example.unitconverter.conversion.LengthConversion;
import com.example.unitconverter.conversion.PowerConversion;
import com.example.unitconverter.conversion.PressureConversion;
import com.example.unitconverter.conversion.SpeedConversion;
import com.example.unitconverter.conversion.TemperatureConvert;
import com.example.unitconverter.conversion.VolumeConversion;
import com.example.unitconverter.conversion.WeightConversion;

public class MainActivity2 extends AppCompatActivity {
    TextView textMeasurement,result;
    Spinner firstSpinner,secondSpinner;
    EditText input;
    String[] units;
    ArrayAdapter<String> myAdapter;
    String firstUnit,secondUnit;
    int index;
    @SuppressLint("SetTextI18n")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textMeasurement = findViewById(R.id.textMeasurement);
        input = findViewById(R.id.et_input1);
        result = findViewById(R.id.text_result);
        firstSpinner = findViewById(R.id.spinner_first);
        secondSpinner = findViewById(R.id.spinner_second);

        String measurement = getIntent().getStringExtra("itemName");
        index = getIntent().getIntExtra("index",0);
        textMeasurement.setText(measurement);

        switch (index){
            case 0:
                units = ApplicationClass.lengthUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Length");
                break;
            case 1:
                units = ApplicationClass.areaUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Area");
                break;
            case 2:
                units = ApplicationClass.volumeUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Volume");
                break;
            case 3:
                units = ApplicationClass.speedUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Speed");
                break;
            case 4:
                units = ApplicationClass.weightUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Weight");
                break;
            case 5:
                units = ApplicationClass.temperatureUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Temperature");
                break;
            case 6:
                units = ApplicationClass.powerUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Power");
                break;
            case 7:
                units = ApplicationClass.pressureUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                input.setHint("Enter Pressure");
                break;
            default:
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                finish();
        }

        myAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        firstSpinner.setAdapter(myAdapter);
        secondSpinner.setAdapter(myAdapter);


        firstSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstUnit = units[position];
                getResult();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        secondSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondUnit = units[position];
                getResult();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                getResult();
            }
        });
    }

    public void getResult(){
        String i  = input.getText().toString();
        switch (index){
            case 0:
                result.setText(LengthConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 1:
                result.setText(AreaConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 2:
                result.setText(VolumeConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 3:
                result.setText(SpeedConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 4:
                result.setText(WeightConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 5:
                result.setText(TemperatureConvert.conversion(firstUnit, secondUnit, i, MainActivity2.this));
                break;
            case 6:
                result.setText(PowerConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            case 7:
                result.setText(PressureConversion.conversion(firstUnit,secondUnit,i,MainActivity2.this));
                break;
            default:
        }
    }
}