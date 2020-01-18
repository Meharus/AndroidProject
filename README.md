# AndroidProject
 >Witam jest to prosta aplikacja stworzona do poznania ciekawostek, 
>zabawy i przekształcania.
>Powstała na potrzeby przedmiotu 
>"Zaawansowane projektowanie aplikacji mobilnych"

# Opis:

## 1. MENU

W prawym górnym rogu aplikacji mamy menu, które pozwala nam "skakać" między zakładkami.
Mamy 3 zakładki:
- Ciekawostki
- Zgadywanka
- Kalkulator
 
KOD:
```sh
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/menuZgadywanka"
        android:title="Zgadywanka" />
    <item
        android:id="@+id/menuCiekawostki"
        android:title="Ciekawostki" />
    <item
        android:id="@+id/menuKalkulator"
        android:title="Kalkulator" />

</menu>
```

## 2. Zgadywanka

>Jest to prosta aplikacja, 
>w której suwakiem zaznaczamy 
>ile cyfer od 1-10 ma uczestniczyć w działaniu. 
>Klikając guzik losuje nam cyfrę z przedziału, 
>który zaznaczyliśmy.

KOD:
```sh
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
```

## 3. Ciekawostki
>W tym elemencie klikając guzik pokazuje nam losowe ciekawostki
>razem z obrazkami, 
>które zostały dodane do tablicy. 
>Używa clasy Facts.

KOD:
```sh
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
```
>Żeby łączył obrazki z 
>treścią ciekawostki 
>dodana jest clasa Facts.

KOD:
```sh
package com.example.androidproject;

public class Facts {


    private int mImage;
    private String mFact;

    public Facts(int mImage, String mFact) {
        this.mImage = mImage;
        this.mFact = mFact;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmFact() {
        return mFact;
    }
}
```

## 4. Kalkulator
>W tej zakładce mamy kalkulator, 
>który przekształca 
>Kilowaty (kW) na Konie Mechaniczne (KM).


KOD:

```sh
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

```
Dziekuję za uwagę ;) 
