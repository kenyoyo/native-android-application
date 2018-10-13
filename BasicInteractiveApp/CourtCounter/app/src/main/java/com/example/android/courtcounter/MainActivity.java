package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA=0;
    private int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void addThreePointA(View v) {
        displayForTeamA(scoreTeamA+=3);
    }

    public void addTwoPointA(View v) {
        displayForTeamA(scoreTeamA+=2);
    }

    public void freeThrowPointA(View v) {
        displayForTeamA(++scoreTeamA);
    }

    public void addThreePointB(View v) {
        displayForTeamB(scoreTeamB+=3);
    }

    public void addTwoPointB(View v) {
        displayForTeamB(scoreTeamB+=2);
    }

    public void freeThrowPointB(View v) {
        displayForTeamB(++scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
