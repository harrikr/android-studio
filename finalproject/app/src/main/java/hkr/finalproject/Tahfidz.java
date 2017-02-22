package hkr.finalproject;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
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
public class Tahfidz extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tahfidz);
        addListenerOnButton();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
/**
 ImageButton sam;
 sam = (ImageButton) findViewById(R.id.buttonsambutan);
 sam.setOnClickListener(new View.OnClickListener() {

@Override public void onClick(View arg0) {

Intent intent = new Intent
(MainActivity.this, Sambutan.class);
startActivity(intent);
}
});
 **/
    }
    ImageButton ja;
    ImageButton ap;
    private void addListenerOnButton() {


        final Context context = this;
        ja = (ImageButton)findViewById(R.id.button_juz_amma);
        ap = (ImageButton)findViewById(R.id.button_ayat_profesi);

        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Tahfidz1.class);
                startActivity(intent);
            }
        });
        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Tahfidz2.class);
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