package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout calculator,etin,taxzone,guideline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        calculator = findViewById(R.id.calculator);
        etin = findViewById(R.id.tin);
        taxzone = findViewById(R.id.taxzone);
        guideline = findViewById(R.id.guideline);


        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Calculator.class);
                startActivity(intent);
            }
        });
        etin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Etin.class);
                startActivity(intent);
            }
        });
        taxzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,TaxZone.class);
                startActivity(intent);
            }
        });
        guideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Guideline.class);
                startActivity(intent);
            }
        });

    }
}