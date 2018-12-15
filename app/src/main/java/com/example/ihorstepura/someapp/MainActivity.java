package com.example.ihorstepura.someapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_1_main);
        editText2 = findViewById(R.id.et_2_main);

        //This is my GitHub test
    }

    @SuppressLint("ShowToast")
    public void logInButtonClick(View view) {
        String login = "immachine";
        String password = "15122018";

        String str_1 = editText1.getText().toString();
        String str_2 = editText2.getText().toString();

        if (str_1.equals(login) & str_2.equals(password)) {
            //Back stack
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        } else if (!str_1.equals(login)) {
            Toast.makeText(getApplicationContext(), "Incorrect login", Toast.LENGTH_LONG).show();
        } else if (!str_2.equals(password)) {
            Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_LONG).show();
        }
    }
}
