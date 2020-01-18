package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menuZgadywanka:
                startActivity(new Intent(MainActivity.this, Zgadywanka.class));
                return true;
            case R.id.menuCiekawostki:
                startActivity(new Intent(MainActivity.this, Ciekawostki.class));
                return true;
            case R.id.menuKalkulator:
                startActivity(new Intent(MainActivity.this, Kalkulator.class));
                return true;
                default:

        }
        return true;
    }
}
