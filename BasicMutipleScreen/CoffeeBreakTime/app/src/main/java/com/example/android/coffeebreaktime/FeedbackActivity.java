package com.example.android.coffeebreaktime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by KAZDO on 27/5/2560.
 */

public class FeedbackActivity extends AppCompatActivity {
    String feedbackOnDrink = "no comment.";
    String feedbackOnWaiter = "no comment.";
    String feedbackOnAtmosphere = "no comment.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        final EditText editText = (EditText) findViewById(R.id.feedback_text);

        TextView textView = (TextView) findViewById(R.id.finish_feedback_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.v("feedbackOnDrink", feedbackOnDrink);
                Log.v("feedbackOnWaiter", feedbackOnWaiter);
                Log.v("feedbackOnAtmosphere", feedbackOnAtmosphere);
                Log.v("feedbackText", editText.getText().toString());

                Intent intent = new Intent(FeedbackActivity.this, ThankActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonOneClicked1(View view) {
        feedbackOnDrink = "Should improve.";
    }

    public void onRadioButtonTwoClicked1(View view) {
        feedbackOnDrink = "Not bad.";
    }

    public void onRadioButtonThreeClicked1(View view) {
        feedbackOnDrink = "I love it.";
    }

    public void onRadioButtonOneClicked2(View view) {
        feedbackOnWaiter = "Should improve.";
    }

    public void onRadioButtonTwoClicked2(View view) {
        feedbackOnWaiter = "Not bad.";
    }

    public void onRadioButtonThreeClicked2(View view) {
        feedbackOnWaiter = "I love it.";
    }

    public void onRadioButtonOneClicked3(View view) {
        feedbackOnAtmosphere = "Should improve.";
    }

    public void onRadioButtonTwoClicked3(View view) {
        feedbackOnAtmosphere = "Not bad.";
    }

    public void onRadioButtonThreeClicked3(View view) {
        feedbackOnAtmosphere = "I love it.";
    }

}
