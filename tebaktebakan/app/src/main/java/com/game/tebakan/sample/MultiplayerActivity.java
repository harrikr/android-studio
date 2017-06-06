package com.game.tebakan.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MultiplayerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_multiplayer);
        Toast.makeText(this, "Koset yak, tahap perkembangan!",Toast.LENGTH_SHORT).show();

    }

    /**
     * setting word for the other player in mulitplayer mode
     * @param v
     */

/*    public void sendWord(View v){
        EditText myEditText = (EditText) findViewById(R.id.editTextWord);
        String word = myEditText.getText().toString();
        myEditText.setText("");
        Intent gameMultiIntent = new Intent(this,GameMultiActivity.class);
        gameMultiIntent.putExtra("word", word);
        startActivity(gameMultiIntent);



    }
*/
}
