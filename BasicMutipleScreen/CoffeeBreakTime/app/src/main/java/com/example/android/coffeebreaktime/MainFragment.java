package com.example.android.coffeebreaktime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by KAZDO on 28/5/2560.
 */

public class MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        FragmentPager adapter = new FragmentPager(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public void reAdapter() {
        Intent intent = new Intent(MainFragment.this, MainFragment.class);
        startActivity(intent);
    }
}
