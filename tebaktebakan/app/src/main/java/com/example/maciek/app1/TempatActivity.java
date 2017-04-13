package com.example.maciek.app1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by harri_kr on 12/04/2017.
 */

public class TempatActivity extends AppCompatActivity{
    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat);



        final Context context = this;
        a = (Button)findViewById(R.id.buttonStart);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, GameActivity.class);
                startActivity(intent);
            }
        });

}}