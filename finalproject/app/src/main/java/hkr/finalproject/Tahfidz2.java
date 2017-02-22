package hkr.finalproject;

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
 * Created by HKR on 27/04/2016.
 */
public class Tahfidz2 extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tahfidz_2);
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
    Button mlk;
    Button ys;
    Button waq;
    Button rhm;
    private void addListenerOnButton() {


        final Context context = this;
        mlk = (Button)findViewById(R.id.buttonmulk);
        ys = (Button)findViewById(R.id.buttonyasin);
        waq = (Button)findViewById(R.id.buttonwaqiah);
        rhm = (Button)findViewById(R.id.buttonrahman);

        mlk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Mulk.class);
                startActivity(intent);
            }
        });
        ys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Yasin.class);
                startActivity(intent);
            }
        });
        rhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Rahman.class);
                startActivity(intent);
            }
        });
        waq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Waqiah.class);
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