package com.example.androidintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "com.example.androidintent.secondactivity.extra.NAME";
    public static final String BIRTHDAY = "com.example.androidintent.secondactivity.extra.BIRTHDAY";
    public static final String ADDRESS = "com.example.androidintent.secondactivity.extra.ADDRESS";

    private EditText nameEditText, birthdayEditText, addressEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        nameEditText = findViewById(R.id.editText_name);
        birthdayEditText = findViewById(R.id.editText_birthday);
        addressEditText = findViewById(R.id.editText_address);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String name = nameEditText.getText().toString();
        String birthday = birthdayEditText.getText().toString();
        String address = addressEditText.getText().toString();

        intent.putExtra(NAME, name);
        intent.putExtra(BIRTHDAY, birthday);
        intent.putExtra(ADDRESS, address);


        startActivity(intent);
    }
}