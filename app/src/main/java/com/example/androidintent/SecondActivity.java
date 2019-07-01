package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        TextView nametextView = findViewById(R.id.textView9);
        nametextView.setText(name);


        String birthday = intent.getStringExtra(MainActivity.BIRTHDAY);
        TextView birthdaytextView = findViewById(R.id.textView10);
        birthdaytextView.setText(birthday);


        String address = intent.getStringExtra(MainActivity.ADDRESS);
        TextView addresstextView = findViewById(R.id.textView11);
        addresstextView.setText(address);

    }

}
