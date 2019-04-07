package com.example.bodymassindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etHeight, etWeight;
    private Button btnCalculate;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalculate){
            BMI_Suman bmi = new BMI_Suman();
            float heightInMeter = Float.parseFloat(etHeight.getText().toString())/100;
            bmi.setHeight(heightInMeter);
            bmi.setWeight(Float.parseFloat(etWeight.getText().toString()));
            float result = bmi.calculateBMI();

            tvResult.setText(Float.toString(result));
            if (result < 18.5) Toast.makeText(this,"Underweight", Toast.LENGTH_LONG).show();
            if (result> 18.5 && result < 24.9) Toast.makeText(this,"Normal Weight", Toast.LENGTH_LONG).show();
            if (result> 25 && result < 29.9) Toast.makeText(this,"Over Weight", Toast.LENGTH_LONG).show();
            if (result >= 30) Toast.makeText(this,"Obesity", Toast.LENGTH_LONG).show();
        }
    }
}
