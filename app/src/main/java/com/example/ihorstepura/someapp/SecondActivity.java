package com.example.ihorstepura.someapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private TextView view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        button_1 = findViewById(R.id.btn_1_second);
        button_1.setOnClickListener(this);
        button_2 = findViewById(R.id.btn_2_second);
        button_2.setOnClickListener(this);
        button_3 = findViewById(R.id.btn_3_second);
        button_3.setOnClickListener(this);
    }


   /* public void cvButtonClick(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void calcButtonClick(View view) {
        Intent intent1 = new Intent(this, FourthActivity.class);
        startActivity(intent1);
    }*/

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btn_1_second:
                intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_2_second:
                break;
            case R.id.btn_3_second:
                intent = new Intent(this, FourthActivity.class);
                startActivity(intent);
                break;
        }
    }
}
