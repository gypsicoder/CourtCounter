package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 3 scores to team A score
     */
    public void add3ScoreToTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 2 scores to team A score
     */
    public void add2ScoreToTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 1 scores to team A score
     */
    public void add1ScoreToTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 3 scores to team B score
     */
    public void add3ScoreToTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 2 scores to team B score
     */
    public void add2ScoreToTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 1 scores to team B score
     */
    public void add1ScoreToTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    /**
     * Reset scores of both team
     */
    public void resetScoresOfBothTeams(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }


    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScoreTextView);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScoreTextView);
        scoreView.setText(String.valueOf(score));
    }
}
