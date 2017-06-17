package com.example.poppy.spinnerapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerCountry;
    String yourName;
    String yoursurname;
    String yourid;
    String countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spinnerCountry = (Spinner) findViewById(R.id.spinner_country);

        final String[] countries = getResources().getStringArray(R.array.country_array);
        ArrayAdapter<String> adapterCountry = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,countries);
        spinnerCountry.setAdapter(adapterCountry);
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             //   String countryName = countries[position]; เก็บค่าเข้าไปที่ String countryName
                //Toast.makeText(MainActivity.this,countries[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button buttonCountry = (Button) findViewById(R.id.button);
        buttonCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countryName = spinnerCountry.getSelectedItem().toString();
                //Toast.makeText(MainActivity.this,countryName.toString(),Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Country");
                builder.setMessage(countryName);
                builder.show();
            }
        });
    }

    public void sendData(View view){
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        yourName = editTextName.getText().toString();

        EditText editTextyoursurname = (EditText) findViewById(R.id.yoursurname);
        yoursurname = editTextyoursurname.getText().toString();

        EditText editTextyourid = (EditText) findViewById(R.id.yourid);
        yourid = editTextyourid.getText().toString();

        Spinner editTextspinner = (Spinner) findViewById(R.id.spinner_country);
        String Spinner = editTextspinner.getSelectedItem().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("yourName",yourName);
        intent.putExtra("yoursurname",yoursurname);
        intent.putExtra("yourid",yourid);
        intent.putExtra("Spinner",Spinner);

        intent.putExtra("tel","0653101391");
        startActivity(intent);
    }
}
