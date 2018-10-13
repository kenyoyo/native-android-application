package com.example.android.footballcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int teamAPoint=0, teamBPoint=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void teamAShoot(View view) {
        Toast.makeText(this, "1 GOAL FOR ARSENAL!!!", Toast.LENGTH_SHORT).show();
        showScoreA(++teamAPoint);
    }

    public void teamBShoot(View view) {
        Toast.makeText(this, "1 GOAL FOR ROMA!!!", Toast.LENGTH_SHORT).show();
        showScoreB(++teamBPoint);
    }

    public void teamAFoul(View view) {
        Toast.makeText(this, "ARSENAL FOUL!", Toast.LENGTH_SHORT).show();
        showScoreA(--teamAPoint);
    }

    public void teamBFoul(View view) {
        Toast.makeText(this, "ROMA FOUL!", Toast.LENGTH_SHORT).show();
        showScoreB(--teamBPoint);
    }

    public void reset(View view) {
        teamAPoint=0;
        teamBPoint=0;
        showScoreA(teamAPoint);
        showScoreB(teamBPoint);
        Toast.makeText(this, "THE MATCH WAS RESET", Toast.LENGTH_SHORT).show();
    }

    public void teamAChangePlayer(View V) {
        Toast.makeText(this, "ARSENAL CHANGE PLAYER", Toast.LENGTH_SHORT).show();
    }

    public void teamBChangePlayer(View V) {
        Toast.makeText(this, "ARSENAL CHANGE PLAYER", Toast.LENGTH_SHORT).show();
    }

    public void showScoreA(int score) {
        TextView text = (TextView) findViewById(R.id.team_A_score);
        text.setText(String.valueOf(score));
    }

    public void showScoreB(int score) {
        TextView text = (TextView) findViewById(R.id.team_B_score);
        text.setText(String.valueOf(score));
    }
}
