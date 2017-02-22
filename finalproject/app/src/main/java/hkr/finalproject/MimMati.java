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
public class MimMati extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mimmati);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface a = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView aa = (TextView) findViewById(R.id.a1);
        aa.setTypeface(a);
        Typeface b = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView bb = (TextView) findViewById(R.id.a2);
        bb.setTypeface(b);
        Typeface c = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView cc = (TextView) findViewById(R.id.a3);
        cc.setTypeface(c);
        Typeface d= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView dd = (TextView) findViewById(R.id.a4);
        dd.setTypeface(d);
        Typeface e = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ee = (TextView) findViewById(R.id.a5);
        ee.setTypeface(e);
        Typeface f= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ff = (TextView) findViewById(R.id.a6);
        ff.setTypeface(f);
        Typeface g= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView gg = (TextView) findViewById(R.id.a7);
        gg.setTypeface(g);
        Typeface h= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView hh = (TextView) findViewById(R.id.a8);
        hh.setTypeface(h);
        Typeface i= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ii = (TextView) findViewById(R.id.a9);
        ii.setTypeface(i);
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
