package com.kurniawanharry165gmail.webviewmodel;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Context context = this;
        a = (Button)findViewById(R.id.button1);
        b = (Button)findViewById(R.id.button2);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Model1.class);
                startActivity(intent);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Model2.class);
                startActivity(intent);
            }
        });
}}
