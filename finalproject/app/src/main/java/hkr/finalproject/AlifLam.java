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
public class AlifLam extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aliflam);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface a = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView aa = (TextView) findViewById(R.id.a);
        aa.setTypeface(a);
        Typeface b = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView bb = (TextView) findViewById(R.id.b);
        bb.setTypeface(b);
        Typeface c = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView cc = (TextView) findViewById(R.id.c);
        cc.setTypeface(c);
        Typeface d= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView dd = (TextView) findViewById(R.id.d);
        dd.setTypeface(d);
        Typeface e = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ee = (TextView) findViewById(R.id.e);
        ee.setTypeface(e);
        Typeface f= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ff = (TextView) findViewById(R.id.f);
        ff.setTypeface(f);
        Typeface g= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView gg = (TextView) findViewById(R.id.g);
        gg.setTypeface(g);
        Typeface h= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView hh = (TextView) findViewById(R.id.h);
        hh.setTypeface(h);
        Typeface i= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ii = (TextView) findViewById(R.id.i);
        ii.setTypeface(i);
        Typeface j = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView jj = (TextView) findViewById(R.id.j);
        jj.setTypeface(j);
        Typeface k= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView kk = (TextView) findViewById(R.id.k);
        kk.setTypeface(k);
        Typeface l= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ll = (TextView) findViewById(R.id.l);
        ll.setTypeface(l);
        Typeface m= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView mm = (TextView) findViewById(R.id.cthalif1);
        mm.setTypeface(m);
        Typeface n= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView nn = (TextView) findViewById(R.id.cthalif2);
        nn.setTypeface(n);
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
