package hkr.finalproject;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by HKR on 26/04/2016.
 */
public class NunMatiTanwin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nunmati);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface a = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView aa = (TextView) findViewById(R.id.b1);
        aa.setTypeface(a);
        Typeface b = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView bb = (TextView) findViewById(R.id.b2);
        bb.setTypeface(b);
        Typeface c = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView cc = (TextView) findViewById(R.id.b3);
        cc.setTypeface(c);
        Typeface d= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView dd = (TextView) findViewById(R.id.b30);
        dd.setTypeface(d);
        Typeface e = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ee = (TextView) findViewById(R.id.b4);
        ee.setTypeface(e);
        Typeface f= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ff = (TextView) findViewById(R.id.b5);
        ff.setTypeface(f);
        Typeface g= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView gg = (TextView) findViewById(R.id.b6);
        gg.setTypeface(g);
        Typeface h= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView hh = (TextView) findViewById(R.id.b7);
        hh.setTypeface(h);
        Typeface i= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ii = (TextView) findViewById(R.id.b8);
        ii.setTypeface(i);
        Typeface j = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView jj = (TextView) findViewById(R.id.b9);
        jj.setTypeface(j);
        Typeface k= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView kk = (TextView) findViewById(R.id.b10);
        kk.setTypeface(k);
        Typeface l= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView ll = (TextView) findViewById(R.id.b11);
        ll.setTypeface(l);
        Typeface m= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView mm = (TextView) findViewById(R.id.b12);
        mm.setTypeface(m);
        Typeface n = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView nn = (TextView) findViewById(R.id.b13);
        nn.setTypeface(n);
        Typeface o= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView oo = (TextView) findViewById(R.id.b14);
        oo.setTypeface(o);
        Typeface p= Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView pp = (TextView) findViewById(R.id.b16);
        pp.setTypeface(p);
        Typeface q = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView qq = (TextView) findViewById(R.id.b17);
        qq.setTypeface(q);
        Typeface r= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView rr = (TextView) findViewById(R.id.b18);
        rr.setTypeface(r);
        Typeface s= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ss = (TextView) findViewById(R.id.b19);
        ss.setTypeface(s);
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
