package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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



        String[] items = new String[]{"Select","Male","Female or 65 years","Physically Challenged","Freedom Fighters"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinneer_view, R.id.tvspineer,items);
        spinner.setAdapter(adapter);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ssalary = salary.getText().toString();
                String shouse = house.getText().toString();
                String sagricultural = agricultural.getText().toString();
                String sbusiness = business.getText().toString();
                String sothers = others.getText().toString();

/*                if (ssalary.length()<=0){
                    salary.setError("Physics Number");
                }
                if (shouse.length()<=0){
                    house.setError("Chemisty Number");
                }
                if (sagricultural.length()<=0){
                    agricultural.setError("Biology Number");
                }
                if (sbusiness.length()<=0){
                    business.setError("Mathmethics Number");
                }
                if (sothers.length()<=0){
                    others.setError("Computer Number");
                }*/

                double dsalary =Double.parseDouble(ssalary);
                double dhouse =Double.parseDouble(shouse);
                double dagricultural =Double.parseDouble(sagricultural);
                double dbusiness =Double.parseDouble(sbusiness);
                double dothers =Double.parseDouble(sothers);
                double total = dsalary + dhouse + dagricultural + dbusiness + dothers;




                String sspninner = spinner.getSelectedItem().toString();
                if (sspninner == "Male"){
                    if (total<=250000){
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax :0.0 BDT");
                    }
                    else if (total<=650000){
                        double tk=((total-250000)*10)/100;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+tk+" BDT");

                    }
                    else if (total<=1150000){
                        double ago = (400000*10)/100;
                        double tk=((total-650000)*15)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=1750000){
                        double ago = ((400000*10)/100) + ((500000*15)/100);
                        double tk=((total-1150000)*20)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=4750000){
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100);
                        double tk=((total-1650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else{
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100) + ((3000000*25)/100);
                        double tk=((total-4650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                }
               // =======================================================================================================

                if (sspninner == "Female or 65 years"){
                    if (total<=300000){
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax :0.0 BDT");
                    }
                    else if (total<=700000){
                        double tk=((total-300000)*10)/100;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+tk+" BDT");

                    }
                    else if (total<=1200000){
                        double ago = (400000*10)/100;
                        double tk=((total-650000)*15)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=1800000){
                        double ago = ((400000*10)/100) + ((500000*15)/100);
                        double tk=((total-1150000)*20)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=4800000){
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100);
                        double tk=((total-1650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else{
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100) + ((3000000*25)/100);
                        double tk=((total-4650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                }

                //============================================================================================================

                if (sspninner == "Physically Challenged"){
                    if (total<=300000+75000){
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax :0.0 BDT");
                    }
                    else if (total<=700000+75000){
                        double tk=((total-375000)*10)/100;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+tk+" BDT");

                    }
                    else if (total<=1200000+750000){
                        double ago = (400000*10)/100;
                        double tk=((total-650000)*15)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=1800000+75000){
                        double ago = ((400000*10)/100) + ((500000*15)/100);
                        double tk=((total-1150000)*20)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=4800000+75000){
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100);
                        double tk=((total-1650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else{
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100) + ((3000000*25)/100);
                        double tk=((total-4650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                }
                //=====================================================================================================

                if (sspninner == "Freedom Fighters"){
                    if (total<=300000+125000){
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax :0.0 BDT");
                    }
                    else if (total<=700000+125000){
                        double tk=((total-425000)*10)/100;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+tk+" BDT");

                    }
                    else if (total<=1200000+125000){
                        double ago = (400000*10)/100;
                        double tk=((total-650000)*15)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=1800000+125000){
                        double ago = ((400000*10)/100) + ((500000*15)/100);
                        double tk=((total-1150000)*20)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else if (total<=4800000+125000){
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100);
                        double tk=((total-1650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                    else{
                        double ago = ((400000*10)/100) + ((500000*15)/100) + ((600000*20)/100) + ((3000000*25)/100);
                        double tk=((total-4650000)*25)/100;
                        double ftk= ago+tk;
                        tvdisplay.setText("Total Icncome :"+total+" BDT"+"\nYour Tax : "+ftk+" BDT");

                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salary.setText("");
                house.setText("");
                agricultural.setText("");
                business.setText("");
                others.setText("");
            }
        });


    }
}