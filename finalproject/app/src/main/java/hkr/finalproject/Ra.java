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
public class Ra extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ra);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface a = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView aa = (TextView) findViewById(R.id.aaa);
        aa.setTypeface(a);
        Typeface b = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView bb = (TextView) findViewById(R.id.bbb);
        bb.setTypeface(b);
        Typeface c = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView cc = (TextView) findViewById(R.id.ccc);
        cc.setTypeface(c);
        Typeface d= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView dd = (TextView) findViewById(R.id.ddd);
        dd.setTypeface(d);
        Typeface e = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ee = (TextView) findViewById(R.id.eee);
        ee.setTypeface(e);
        Typeface f= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ff = (TextView) findViewById(R.id.fff);
        ff.setTypeface(f);
        Typeface g= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView gg = (TextView) findViewById(R.id.ggg);
        gg.setTypeface(g);
        Typeface h= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView hh = (TextView) findViewById(R.id.hhh);
        hh.setTypeface(h);
        Typeface i= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ii = (TextView) findViewById(R.id.iii);
        ii.setTypeface(i);
        Typeface j = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView jj = (TextView) findViewById(R.id.jjj);
        jj.setTypeface(j);
        Typeface k= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView kk = (TextView) findViewById(R.id.kkk);
        kk.setTypeface(k);
        Typeface l= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView ll = (TextView) findViewById(R.id.lll);
        ll.setTypeface(l);
        Typeface m= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView mm = (TextView) findViewById(R.id.mmm);
        mm.setTypeface(m);
        Typeface n = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView nn = (TextView) findViewById(R.id.nnn);
        nn.setTypeface(n);
        Typeface o= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView oo = (TextView) findViewById(R.id.ooo);
        oo.setTypeface(o);
        Typeface p= Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView pp = (TextView) findViewById(R.id.ppp);
        pp.setTypeface(p);

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
