package com.example.android.coffeebreaktime;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderButton(View view) {
        Intent menusIntent = new Intent(MainActivity.this, MainFragment.class);
        startActivity(menusIntent);
    }
}

