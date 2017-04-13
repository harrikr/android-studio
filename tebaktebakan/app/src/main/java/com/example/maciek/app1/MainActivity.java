package com.example.maciek.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startSinglePlayerGame (View v){
        Intent i = new Intent(this,TempatActivity.class);

        startActivity(i);

    }

    public void startMultiPlayerGame(View v){
        Toast.makeText(this, "Koset yak, tahap perkembangan!",Toast.LENGTH_SHORT).show();
        //Intent i = new Intent(this,MultiplayerActivity.class);

        //startActivity(i);

    }

    public void startAbout(View v){
        Intent i = new Intent(this,About.class);

        startActivity(i);

    }
    public void openScores(View v){
        Intent i = new Intent(this,ScoresActivity.class);

        startActivity(i);

    }
}
