package hkr.finalproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by HKR on 26/04/2016.
 */
public class HukumBaca extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hukum_baca);
        addListenerOnButton();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface sembarang = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button samaja = (Button) findViewById(R.id.buttonaliflam);
        samaja.setTypeface(sembarang);
        Typeface sembaran = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button samaj = (Button) findViewById(R.id.buttonmad);
        samaj.setTypeface(sembaran);
        Typeface sembara = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button sama = (Button) findViewById(R.id.buttonmimmati);
        sama.setTypeface(sembara);
        Typeface sembar = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button same = (Button) findViewById(R.id.buttonnunmati);
        same.setTypeface(sembar);
        Typeface semba = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button sam = (Button) findViewById(R.id.buttonqalqalah);
        sam.setTypeface(semba);
        Typeface semb = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        Button sa = (Button) findViewById(R.id.buttonra);
        sa.setTypeface(semb);
    }

    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    private void addListenerOnButton() {


        final Context context = this;
        a = (Button)findViewById(R.id.buttonaliflam);
        b = (Button)findViewById(R.id.buttonmad);
        c = (Button)findViewById(R.id.buttonmimmati);
        d = (Button)findViewById(R.id.buttonnunmati);
        e = (Button)findViewById(R.id.buttonqalqalah);
        f = (Button)findViewById(R.id.buttonra);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AlifLam.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Mad.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MimMati.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, NunMatiTanwin.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Qalqalah.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Ra.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        return true;
    }
}