package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import static java.util.Arrays.*;

public class Ciekawostki extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciekawostki);

        mImageView  = findViewById(R.id.imageView);
        mTextView = findViewById(R.id.fact);
        mButton = findViewById(R.id.factButton);
        showRandomFact();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });

    }
    public void showRandomFact(){
        shuffleFacts();
        mImageView.setImageResource(factArray[0].getmImage());
        mTextView.setText(factArray[0].getmFact());

    }



        Facts f01 = new Facts(R.drawable.amg, "Firma od 2005 roku należąca w całości do grupy Daimler AG, zajmująca się produkcją samochodów sportowych. Siedziba mieści się w Affalterbach, niedaleko Stuttgartu w Niemczech. Roczna sprzedaż (2015) wynosi 70 000 pojazdów");
        Facts f02 = new Facts(R.drawable.auto, "Koenigsegg Agera RS. Najszybszy seryjny samochód na świecie. Podczas przejazdów osiągnięto maksymalnie 457,9 km/h. Silnik: V8, 5,0 l, 1115 KM. V-max: 457,2 km/h ");
        Facts f03 = new Facts(R.drawable.drzwi, "Mercedes-Benz SLS. Ma najbardziej kontrowersyjne drzwi na świecie");
        Facts f04 = new Facts(R.drawable.honda, " Japońskie przedsiębiorstwo branży motoryzacyjnej produkujące samochody, motocykle, skutery, samoloty, silniki, roboty oraz różnego rodzaju maszyny. Największy na świecie producent silników.");
        Facts f05 = new Facts(R.drawable.najmniejszy, "Najmniejszy samochód świata.Waży 59 kg, ma trzy koła i jedne drzwi, rozpędza się do 80 km na godzinę - to Peel");
        Facts f06 = new Facts(R.drawable.najwiekszy, "Cadillac Series 75. Model ten mierzył bowiem aż 6405 mm długości. Co ciekawe, najdłuższym obecnie produkowanym autem na świecie jest Maybach 62 z nadwoziem o długości 6165 mm.");
        Facts f07 = new Facts(R.drawable.toyota, " Japoński koncern motoryzacyjny utworzony w 1937 roku.");
        Facts f08 = new Facts(R.drawable.peugeot, "Francuska marka samochodów osobowych i dostawczych, a także rowerów, motocykli i skuterów, powstała w 1810 roku. Współtworzy koncern PSA.");

        Facts [] factArray = new Facts[]{
                f01,f02,f03,f04,f05,f06,f07,f08
        };

    public void shuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));


    }
}
