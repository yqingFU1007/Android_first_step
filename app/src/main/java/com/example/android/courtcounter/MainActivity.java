package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;
    int warningA = 0;
    int warningB = 0;
    String wrongMemberA = "";
    String wrongMemberAAvant = "";
    String wrongMemberBAvant = "";
    String wrongMemberB = "";
    String temp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */


    public void getPointA(View view) {
        totalScoreA += 1;
        displayForTeamA(totalScoreA);
    }

    public void warningA(View view) {
        warningA += 1;
        displayForWarningTeamA(warningA);
    }

    public void warningB(View view) {
        warningB += 1;
        displayForWarningTeamB(warningB);
    }

    /**
     * Displays the given score for Team B.
     */


    public void getPointB(View view) {
        totalScoreB += 1;
        displayForTeamB(totalScoreB);
    }

    public void type0(View view) {
        if (temp.length() < 2) {
            temp += "0";
        }
    }

    public void type1(View view) {
        if (temp.length() < 2) {
            temp += "1";
        }
    }

    public void type2(View view) {
        if (temp.length() < 2) {
            temp += "2";
        }
    }

    public void type3(View view) {
        if (temp.length() < 2) {
            temp += "3";
        }
    }

    public void type4(View view) {
        if (temp.length() < 2) {
            temp += "4";
        }
    }

    public void type5(View view) {
        if (temp.length() < 2) {
            temp += "5";
        }
    }

    public void type6(View view) {
        if (temp.length() < 2) {
            temp += "6";
        }
    }

    public void type7(View view) {
        if (temp.length() < 2) {
            temp += "7";
        }
    }

    public void type8(View view) {
        if (temp.length() < 2) {
            temp += "8";
        }
    }

    public void type9(View view) {
        if (temp.length() < 2) {
            temp += "9";
        }
    }

    public void cancel(View view) {
        if (temp != "") {
            temp = "";
        }
        if (temp == "") {
            wrongMemberA = wrongMemberAAvant;
            wrongMemberB = wrongMemberBAvant;
        }
        displayWrongA(wrongMemberA);
        displayWrongB(wrongMemberB);
    }

    public void memberA(View view) {
        wrongMemberAAvant = wrongMemberA;
        wrongMemberBAvant = wrongMemberB;
        wrongMemberA = wrongMemberA + temp + ".";
        temp = "";
        displayWrongA(wrongMemberA);
    }

    public void memberB(View view) {
        wrongMemberAAvant = wrongMemberA;
        wrongMemberBAvant = wrongMemberB;
        wrongMemberB = wrongMemberB + temp + ".";
        temp = "";
        displayWrongB(wrongMemberB);
    }

    public void reset(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        warningA = 0;
        warningB = 0;
        wrongMemberA = "";
        wrongMemberB = "";
        displayForWarningTeamA(warningA);
        displayForWarningTeamB(warningB);
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
        displayWrongA(wrongMemberA);
        displayWrongB(wrongMemberB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForWarningTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_warning);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForWarningTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_warning);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWrongA(String textA) {
        TextView t = (TextView) findViewById(R.id.wrongA);
        t.setText(textA);
    }

    public void displayWrongB(String text) {
        TextView t = (TextView) findViewById(R.id.wrongB);
        t.setText(text);
    }
}


