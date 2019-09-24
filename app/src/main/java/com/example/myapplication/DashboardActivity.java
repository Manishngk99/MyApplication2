package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSum, btnTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnSum = findViewById(R.id.btnSum);
        btnTemp = findViewById(R.id.btnTemp);

        btnSum.setOnClickListener(this);
        btnTemp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btnSum){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.btnTemp){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
