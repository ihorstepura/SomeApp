package com.example.ihorstepura.someapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    private String num_1 = "";
    private String op = "";
    private String num_2 = "";
    private String equal = "";

    TextView number;
    TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        number = findViewById(R.id.tv_number);
        result = findViewById(R.id.tv_result);
    }

    public void setButtonNumber(View view) {
        if (op.equals("")) {
            num_1 += ((Button) view).getText().toString();
            number.setText(num_1);
        } else {
            num_2 += ((Button) view).getText().toString();
            number.setText(num_2);
        }
    }

    public void setButtonOperation(View view) {
        if (op.isEmpty()) {
            op = ((Button) view).getText().toString();
        } else {
            num_1 = result.getText().toString();
            number.setText(num_1);
            num_2 = "";
            result.setText("");
            op = ((Button) view).getText().toString();
        }
    }


    @SuppressLint("SetTextI18n")
    public void setButtonEqual(View view) {


        if (num_2.equals("") || num_1.equals("")) {
            setButtonClear(view);
            Toast.makeText(this, "Invalid format used", Toast.LENGTH_LONG).show();
        } else if (num_1.length() > 9 || num_2.length() > 9) {
            setButtonClear(view);
            Toast.makeText(this, "Maximum number of digits (9) exceeded", Toast.LENGTH_LONG).show();
        } else if (op.length() > 1) {
            setButtonClear(view);
            Toast.makeText(this, "Invalid format used", Toast.LENGTH_LONG).show();
        } else if (!num_1.isEmpty() && !num_2.isEmpty() && !equal.isEmpty()) {
            num_1 = result.getText().toString();
            number.setText(num_1);
        }

        int num1;
        int num2;
        int res;

        switch (op) {
            case "+":
                num1 = Integer.parseInt(num_1);
                num2 = Integer.parseInt(num_2);
                res = num1 + num2;
                equal = Integer.toString(res);
                result.setText(equal);
                break;
            case "*":
                num1 = Integer.parseInt(num_1);
                num2 = Integer.parseInt(num_2);
                res = num1 * num2;
                equal = Integer.toString(res);
                result.setText(equal);
                break;
        }
    }

    public void setButtonClear(View view) {
        num_1 = "";
        op = "";
        num_2 = "";
        equal = "";
        number.setText("");
        result.setText("");
    }
}
