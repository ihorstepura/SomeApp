package com.example.ihorstepura.someapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private TextView view;

    View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener btnClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        button_1 = findViewById(R.id.btn_1_second);
        button_1.setOnClickListener(btnClickListener);

        button_2 = findViewById(R.id.btn_2_second);
        button_2.setOnClickListener(btnClickListener2);
    }
}
