package com.example.maciek.app1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * reading scores with the use of shared preferences
 */
public class ScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        SharedPreferences preferences = getSharedPreferences("MYPREF",MODE_PRIVATE);

        String scores = preferences.getString("SCORES","NO SCORES");

        Log.d("MYLOG",scores);

        TextView textViewScores = (TextView) findViewById(R.id.textViewScores);

        textViewScores.setText(scores);


    }
}
