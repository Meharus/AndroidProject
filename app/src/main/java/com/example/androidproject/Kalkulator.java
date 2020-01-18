package com.example.androidproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kalkulator extends AppCompatActivity {
    EditText editTextInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }
    public void KMCount (View view){


        TextView x = findViewById(R.id.KWeditText);
        TextView result = findViewById(R.id.textViewResult);
        result.setText(" ");
        double wynik = Double.valueOf(x.getText().toString())*1.36;

        result.setText("Samochód ma:"+ wynik + "Koni Mechanicznych" );
    }
}
