package com.example.android.myfootballapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHome = 0;
    int scoreAway = 0;
    int foulsHome = 0;
    int foulsAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayHome(scoreHome);
        displayAway(scoreAway);
        foulsHome(foulsHome);
        foulsAway(foulsAway);
    }

    public void displayHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    public void foulsHome(int foulsHome) {
        TextView foulsView = (TextView) findViewById(R.id.foulsHome);
        foulsView.setText(String.valueOf(foulsHome));
    }

    public void foulsAway(int foulsAway) {
        TextView foulsView = (TextView) findViewById(R.id.foulsAway);
        foulsView.setText(String.valueOf(foulsAway));
    }

    public void touchdownHome(View v) {
        scoreHome = scoreHome + 6;
        displayHome(scoreHome);
    }

    public void touchdownAway(View v) {
        scoreAway = scoreAway + 6;
        displayAway(scoreAway);
    }

    public void fieldGoalHome(View v) {
        scoreHome = scoreHome + 3;
        displayHome(scoreHome);
    }

    public void fieldGoalAway(View v) {
        scoreAway = scoreAway + 3;
        displayAway(scoreAway);
    }

    public void extraPointHome(View v) {
        scoreHome = scoreHome + 1;
        displayHome(scoreHome);
    }

    public void extraPointAway(View v) {
        scoreAway = scoreAway + 1;
        displayAway(scoreAway);
    }

    public void safetyHome(View v) {
        scoreHome = scoreHome + 2;
        displayHome(scoreHome);
    }

    public void safetyAway(View v) {
        scoreAway = scoreAway + 2;
        displayAway(scoreAway);
    }

    public void addFoulHome(View v) {
        foulsHome = foulsHome + 1;
        foulsHome(foulsHome);
    }

    public void addFoulAway(View v) {
        foulsAway = foulsAway + 1;
        foulsAway(foulsAway);
    }

    public void reset(View v) {
        scoreHome = 0;
        scoreAway = 0;
        foulsHome = 0;
        foulsAway = 0;
        displayHome(scoreHome);
        displayAway(scoreAway);
        foulsHome(foulsHome);
        foulsAway(foulsAway);
    }

}
