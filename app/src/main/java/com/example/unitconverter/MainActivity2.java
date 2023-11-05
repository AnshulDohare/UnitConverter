package com.example.unitconverter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView textMeasurement,result;
    Spinner firstSpinner,secondSpinner;
    EditText input;
    String[] units;
    ArrayAdapter<String> myAdapter;
    String firstUnit,secondUnit;
    TemperatureConvert temperatureConvert;
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
        int index = getIntent().getIntExtra("index",0);
        textMeasurement.setText(measurement+"");

        switch (index){
            case 0:
                Toast.makeText(this, "Length", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 1:
                Toast.makeText(this, "Area", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 2:
                Toast.makeText(this, "Volume", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 3:
                Toast.makeText(this, "Speed", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 4:
                Toast.makeText(this, "Weight", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 5:
                units = ApplicationClass.temperatureUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                myAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
                firstSpinner.setAdapter(myAdapter);
                secondSpinner.setAdapter(myAdapter);
                temperatureConvert = new TemperatureConvert();
                break;
            case 6:
                Toast.makeText(this, "Power", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 7:
                Toast.makeText(this, "Pressure", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                finish();
                finish();
        }

        firstSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstUnit = units[position];
                String i  = input.getText().toString();
                result.setText(temperatureConvert.conversion(firstUnit,secondUnit,i,MainActivity2.this));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        secondSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondUnit = units[position];
                String i  = input.getText().toString();
                result.setText(temperatureConvert.conversion(firstUnit,secondUnit,i,MainActivity2.this));
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
                String i  = input.getText().toString();
                if(index==5) {
                    result.setText(temperatureConvert.conversion(firstUnit, secondUnit, i, MainActivity2.this));
                }
                else{
                    Toast.makeText(MainActivity2.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}