package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText salary,house,agricultural,business,others;
    Button reset,calculate;
    TextView tvdisplay;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        salary = findViewById(R.id.salary);
        house = findViewById(R.id.house);
        agricultural = findViewById(R.id.agricultural);
        business = findViewById(R.id.business);
        others = findViewById(R.id.others);
        reset = findViewById(R.id.reset);
        calculate = findViewById(R.id.calculate);
        tvdisplay = findViewById(R.id.tv);
        spinner = findViewById(R.id.spinner);


    }
}