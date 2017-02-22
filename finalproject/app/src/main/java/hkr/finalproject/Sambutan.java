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
public class Sambutan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sambutan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface sembarang = Typeface.createFromAsset(getAssets(), "Gabriola.ttf");
        TextView samaja = (TextView) findViewById(R.id.isisambutan);
        samaja.setTypeface(sembarang);
        Typeface sembaran = Typeface.createFromAsset(getAssets(), "FELIXTI.TTF");
        TextView samaj = (TextView) findViewById(R.id.jdlsambutan);
        samaj.setTypeface(sembaran);
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
