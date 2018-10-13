package com.example.android.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int userPoint=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quiz1Answer1(View view) {
        userPoint++;
        Toast.makeText(this, "Wow you are correct", Toast.LENGTH_SHORT).show();
    }

    public void quiz1Answer2(View view) {
        Toast.makeText(this, "Not correct answer.", Toast.LENGTH_SHORT).show();
    }

    public void submitAnswerQuiz3(View view){
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.quiz3_button1);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.quiz3_button2);
        final RadioButton radioButton3 = (RadioButton) findViewById(R.id.quiz3_button3);

        if(radioButton1.isChecked())
            Toast.makeText(this, "Not correct answer.", Toast.LENGTH_SHORT).show();
        else if(radioButton2.isChecked())
            Toast.makeText(this, "Not correct answer.", Toast.LENGTH_SHORT).show();
        else if(radioButton3.isChecked()) {
            Toast.makeText(this, "Wow you are correct.", Toast.LENGTH_SHORT).show();
            userPoint++;
        }
    }

    public void submitAnswerQuiz4(View view) {
        Toast.makeText(this, "Very Cool!!!", Toast.LENGTH_SHORT).show();
    }

    public void quiz5Answer1() {
        Toast.makeText(this, "Thank you your point is " + userPoint, Toast.LENGTH_SHORT).show();
    }

    public void quiz5Answer2() {
        Toast.makeText(this, "Thank you your point is " + userPoint, Toast.LENGTH_SHORT).show();
    }
}

