package com.example.ihorstepura.someapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_1_main);
        editText2 = findViewById(R.id.et_2_main);
    }

    @SuppressLint("ShowToast")
    public void logInButtonClick(View view) {
        String login = "immachine";
        String password = "15122018";

        String str_1 = editText1.getText().toString();
        String str_2 = editText2.getText().toString();

        if (str_1.equals("") || str_2.equals("")) {
            Toast.makeText(getApplicationContext(), "Some field is empty", Toast.LENGTH_LONG).show();
        } else if (!str_1.equals(login)) {
            Toast.makeText(getApplicationContext(), "Incorrect login", Toast.LENGTH_LONG).show();
        } else if (!str_2.equals(password)) {
            Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_LONG).show();
        } else {
            //Back stack
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
