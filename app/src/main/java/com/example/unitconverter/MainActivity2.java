package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
=======
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

public class MainActivity2 extends AppCompatActivity {
    TextView textMeasurement;
    Spinner firstSpinner,secondSpinner;
    EditText firstInput;
    EditText secondInput;
    String units[];
    ArrayAdapter<String> myAdapter;
    String firstUnit,secondUnit;
    TemperatureConvert temperatureConvert;
    @SuppressLint("SetTextI18n")
>>>>>>> 4ce8e24 (Worked on MainActivity2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
<<<<<<< HEAD
=======
        textMeasurement = findViewById(R.id.textMeasurement);
        firstInput = findViewById(R.id.et_input1);
        secondInput = findViewById(R.id.et_input2);
        firstSpinner = findViewById(R.id.spinner_first);
        secondSpinner = findViewById(R.id.spinner_second);

        String measurement = getIntent().getStringExtra("itemName");
        int index = getIntent().getIntExtra("index",0);
        textMeasurement.setText(measurement+"");

        switch (index){
            case 5:
                units = ApplicationClass.temperatureUnit;
                myAdapter = new ArrayAdapter<>(MainActivity2.this,R.layout.spinner_layout,units);
                myAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
                firstSpinner.setAdapter(myAdapter);
                secondSpinner.setAdapter(myAdapter);
                temperatureConvert = new TemperatureConvert();
                break;
            default:
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                finish();
        }

        firstSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                firstUnit = units[position];
                String input1  = firstInput.getText().toString();
                double result = temperatureConvert.conversion(firstUnit,secondUnit,input1,MainActivity2.this);
                secondInput.setText(result+"");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        secondSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secondUnit = units[position];
                String input1  = firstInput.getText().toString();
                double result = temperatureConvert.conversion(firstUnit,secondUnit,input1,MainActivity2.this);
                secondInput.setText(result+"");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        firstInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String input1  = firstInput.getText().toString();
                double result = temperatureConvert.conversion(firstUnit,secondUnit,input1,MainActivity2.this);
                secondInput.setText(result+"");
            }
        });
>>>>>>> 4ce8e24 (Worked on MainActivity2)
    }
}