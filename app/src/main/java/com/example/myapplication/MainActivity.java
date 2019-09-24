package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText etFirstNo, etSecondNo, etTemp, etP, etR, etT;
    private Button btnSum, btnSub, btnCelcius, btnFahrenheit, btnSI;
    int first, second, result, P, T, Ra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //oriantation
        setContentView(R.layout.activity_main);

        //Binding
        etFirstNo = findViewById(R.id.etFirstNo);
        etSecondNo = findViewById(R.id.etSecond);
        etTemp = findViewById(R.id.etTemp);
        etP = findViewById(R.id.etP);
        etR = findViewById(R.id.etR);
        etT = findViewById(R.id.etT);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSubtract);
        btnCelcius = findViewById(R.id.btnCelcius);
        btnFahrenheit = findViewById(R.id.btnFahrenheit);
        btnSI = findViewById(R.id.btnSI);


        // Button ko click listener
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstNo.getText().toString());
                second = Integer.parseInt(etSecondNo.getText().toString());
                result = first + second;

                // for output
                Toast.makeText(MainActivity.this, "Sum is " + result, Toast.LENGTH_LONG).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstNo.getText().toString());
                second = Integer.parseInt(etSecondNo.getText().toString());
                result = first - second;
                Toast.makeText(MainActivity.this, "Subtraction is " + result, Toast.LENGTH_LONG).show();
            }
        });

        btnCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etTemp.getText().toString());
                result = ((first - 32)*5)/9;
                Toast.makeText(MainActivity.this, "Celcius is" + result, Toast.LENGTH_LONG).show();
            }
        });

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etTemp.getText().toString());
                result = ((first*9/5) + 32);
                Toast.makeText(MainActivity.this, "Fahrenheit is" + result, Toast.LENGTH_LONG).show();
            }
        });

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                P = Integer.parseInt(etP.getText().toString());
                Ra = Integer.parseInt(etR.getText().toString());
                T = Integer.parseInt(etT.getText().toString());

                result = (P*Ra*T)/100;

                Toast.makeText(MainActivity.this, "Simple Interest" + result, Toast.LENGTH_LONG).show();

        }});


    }
}
