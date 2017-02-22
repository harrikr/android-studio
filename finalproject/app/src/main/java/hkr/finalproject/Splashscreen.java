package hkr.finalproject;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by HKR on 30/04/2016.
 */
public class Splashscreen extends AppCompatActivity {

    private static int splashInterval = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);

                this.finish();
            }
            private void finish(){

            }
        }, splashInterval);
        Typeface sembarang = Typeface.createFromAsset(getAssets(), "HoboStd.otf");
        TextView samaaja = (TextView) findViewById(R.id.bismillah);
        samaaja.setTypeface(sembarang);
    }
}
