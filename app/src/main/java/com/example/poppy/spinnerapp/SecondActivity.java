package com.example.poppy.spinnerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        String surname = intent.getStringExtra("yoursurname");
        String idname = intent.getStringExtra("yourid");
        String Spinner = intent.getStringExtra("Spinner");

        TextView textName = (TextView) findViewById(R.id.textView);
        TextView textsurName = (TextView) findViewById(R.id.textView4);
        TextView textidName = (TextView) findViewById(R.id.textView5);
        TextView textspinner = (TextView) findViewById(R.id.textView2);

        textName.setText(name);
        textsurName.setText(surname);
        textidName.setText(idname);
        textspinner.setText(Spinner);
    }
}
