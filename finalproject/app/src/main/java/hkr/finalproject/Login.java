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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HKR on 24/04/2016.
 */
public class Login extends AppCompatActivity{
    EditText ed1,ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_login);//show form2
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);

        b1 = (Button) findViewById(R.id.button);
        final Context context=this;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("dev") &&
                        ed2.getText().toString().equals("dev")) {
                    Toast.makeText(getApplicationContext(), "Sukses Login Developer", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Developer.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();

                }
            }
        });
        Typeface sembaran = Typeface.createFromAsset(getAssets(), "AA.TTF");
        TextView samaj = (TextView) findViewById(R.id.cuf);
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
