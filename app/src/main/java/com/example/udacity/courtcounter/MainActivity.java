package com.example.udacity.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreteamb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threepoints(View view) {
        score = score + 3;
        displayForTeamA(score);
    }

    public void twopoints(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    public void throwball(View view) {
        score = score + 1;
        displayForTeamA(score);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threepointsforb(View view) {
        scoreteamb = scoreteamb + 3;
        displayForTeamB(scoreteamb);
    }

    public void twopointsforb(View view) {
        scoreteamb = scoreteamb + 2;
        displayForTeamB(scoreteamb);
    }

    public void throwballforb(View view) {
        scoreteamb = scoreteamb + 1;
        displayForTeamB(scoreteamb);

    }
    public void resetscore(View view){
        score = 0;
        scoreteamb = 0;
        displayForTeamA(score);
        displayForTeamB(scoreteamb);
    }


}
