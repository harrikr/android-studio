package com.example.maciek.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    String mWord;

    int mFailCounter = 0;
    int mGuessedLetter = 0;

    int mPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRandomWord();
        createTextViews(mWord);
    }


    /**
     * Retrieving the letter introduced on the editTextLetter
     * @param v (button click)
     */
    public void introduceLetter(View v){

        EditText myEditText = (EditText) findViewById(R.id.editTextLetter);

        String letter = myEditText.getText().toString();

        myEditText.setText("");

        Log.d("MYLOG", "Surat Masuk: "+ letter);

        if(letter.length() == 1){
            checkLetter(letter.toUpperCase());
        } else {
            Toast.makeText(this, "Masukkan Huruf!",Toast.LENGTH_SHORT).show();
        }
    }
    /**
     * Checking if the letter introduced matches any letter in the word
     * @param introducedLetter (letter introduced by the user)
     */
    public void checkLetter(String introducedLetter){

        char charIntroduced = introducedLetter.charAt(0);

        boolean letterGuessed = false;

        for (int i = 0; i < mWord.length(); i++){


            char charFromTheWord = mWord.charAt(i);
            Log.d("MYLOG", "CEK!: "+ charFromTheWord);

            if(charFromTheWord == charIntroduced){


                Log.d("MYLOG", "cocok");

                showLettersAtIndex(i, charIntroduced);

                letterGuessed = true;
                mGuessedLetter++;
            }

            }

        if(letterGuessed == false){
            letterFailed(Character.toString(charIntroduced));
        }
        if(mGuessedLetter == mWord.length()){
            mPoints++;
            clearScreen();
            setRandomWord();
            createTextViews(mWord);


        }

    }

    /**
     * generating random word from arrayWords
     */
    public void setRandomWord(){
        String words = "TUTUPODOL CICAK CIBUK KRAN AIR KECOAK NYAMUK MRUTU AKU";
        String[] arrayWords = words.split(" ");

        Log.d("MYLOG", "Array "+ arrayWords.length);
        int randomNumber = (int) (Math.random() * arrayWords.length);
        String randomWord = arrayWords[randomNumber];

        mWord = randomWord;

    }
    /**
     * dynamically creates layout for given word
     * @param word
     */
    public void createTextViews(String word){

        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        Log.d("MYLOG", "sent word: "+ word.length());
        for(int i = 0; i < word.length(); i++){
            TextView newTextView = (TextView) getLayoutInflater().inflate(R.layout.textview,null);

            layoutLetters.addView(newTextView);
        }

    }

    /**
     * clear the screen and reset counters
     */
    public void clearScreen() {
        TextView textView = (TextView) findViewById(R.id.failedLetterText);
        textView.setText("");

        mFailCounter = 0;
        mGuessedLetter = 0;
        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        layoutLetters.removeAllViewsInLayout();
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.hangman1);
    }
    /**
     * Displaying a letter guessed by the user
     */
    public void showLettersAtIndex(int position, char letterGuessed){

        LinearLayout layoutLetter = (LinearLayout) findViewById(R.id.layoutLetters);

        TextView textView = (TextView) layoutLetter.getChildAt(position);

        textView.setText(Character.toString(letterGuessed));

    }

    /**
     * display failed letters , change imageview, new intent when the game is over -> GameOverActivity
     * @param letterFailed
     */
    public void letterFailed(String letterFailed){

        TextView textView = (TextView) findViewById(R.id.failedLetterText);

        String prevFail = textView.getText().toString();

        textView.setText(prevFail + letterFailed);

        mFailCounter++;

        ImageView imageView = (ImageView) findViewById(R.id.imageView3);

        if (mFailCounter == 1){
            imageView.setImageResource(R.drawable.hangman2);
        }
        else if (mFailCounter == 2)
        {
            imageView.setImageResource(R.drawable.hangman3);
        }
        else if (mFailCounter == 3)
        {
            imageView.setImageResource(R.drawable.hangman4);
        }
        else if (mFailCounter == 4)
        {
            imageView.setImageResource(R.drawable.hangman5);
        }
        else if (mFailCounter == 5)
        {
            imageView.setImageResource(R.drawable.hangman6);
        }
        else if (mFailCounter == 6)
        {
            Intent gameOverIntent = new Intent(this,GameOverActivity.class);
            gameOverIntent.putExtra("points_id", mPoints);
            startActivity(gameOverIntent);
            finish();

        }



    }
}
