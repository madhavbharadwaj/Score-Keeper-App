package com.example.madhav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int update_pointsA=0;
    int update_pointsB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void reset(View view)
    {
        update_pointsA=0;
        update_pointsB=0;

        displayForTeamA(update_pointsA);
        displayForTeamB(update_pointsB);
    }
    public void plus_3A(View view)
    {
        update_pointsA = update_pointsA + 3;
        displayForTeamA(update_pointsA);
    }

    public void plus_2A(View view)
    {
        update_pointsA = update_pointsA + 2;
        displayForTeamA(update_pointsA);

    }

    public void pfreeA(View view)
    {
        update_pointsA = update_pointsA + 1;
        displayForTeamA(update_pointsA);

    }

    public void plus_3B(View view)
    {
        update_pointsB = update_pointsB + 3;
        displayForTeamB(update_pointsB);
    }

    public void plus_2B(View view)
    {
        update_pointsB = update_pointsB + 2;
        displayForTeamB(update_pointsB);

    }

    public void pfreeB(View view)
    {
        update_pointsB = update_pointsB + 1;
        displayForTeamB(update_pointsB);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
