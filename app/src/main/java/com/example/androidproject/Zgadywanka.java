package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class Zgadywanka extends AppCompatActivity {

    Button mieszajButton;
    TextView results;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zgadywanka);

        mieszajButton = findViewById(R.id.mieszajButton);
        results = findViewById(R.id.results);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(10);
        seekBar.setProgress(3);
        mieszajButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int value = random.nextInt(seekBar.getProgress());
                results.setText(""+ value);

            }
        });


    }
}
