package hkr.finalproject;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HKR on 26/04/2016.
 */
public class Qalqalah extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qalqalah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface a = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView aa = (TextView) findViewById(R.id.aa);
        aa.setTypeface(a);
        Typeface b = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView bb = (TextView) findViewById(R.id.bb);
        bb.setTypeface(b);
        Typeface c = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView cc = (TextView) findViewById(R.id.cc);
        cc.setTypeface(c);
        Typeface d= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView dd = (TextView) findViewById(R.id.dd);
        dd.setTypeface(d);
        Typeface e = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ee = (TextView) findViewById(R.id.ee);
        ee.setTypeface(e);
        Typeface f= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ff = (TextView) findViewById(R.id.ff);
        ff.setTypeface(f);
        Typeface g = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView gg = (TextView) findViewById(R.id.cthqalq1);
        gg.setTypeface(g);
        Typeface h= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView hh = (TextView) findViewById(R.id.cthqalq2);
        hh.setTypeface(h);
        Typeface ht= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView hht = (TextView) findViewById(R.id.tambahanq);
        hht.setTypeface(ht);
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
