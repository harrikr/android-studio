package com.game.tebakan.sample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * GameOver window, showing points , option to save scores
 */

public class GameOverActivity extends AppCompatActivity {

    int mPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        int points = getIntent().getIntExtra("points_id",0);
        Log.d("MYLOG", "points: "+ points);
        TextView textViewPoints = (TextView) findViewById(R.id.textViewPoints);
        textViewPoints.setText(String.valueOf(points));

        mPoints = points;


    }

    /**
     * saving scores with the use of sharedpreferences
     * @param v
     */
    public void saveScore(View v){
        SharedPreferences preferences = getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        EditText editText = (EditText) findViewById(R.id.addName);
        String name = editText.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();

        String previousPoints = preferences.getString("SCORES","");

        editor.putString("SCORES",name + " " + mPoints + " POINTS\n" + previousPoints);
        editor.commit();
        finish();
    }
}
