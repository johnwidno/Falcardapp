package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        TextView questiontext = findViewById(R.id.flashcardquestion_textview);
        TextView answerquestion = findViewById(R.id.flashcard_ansewrtextview);
                 answerquestion.setVisibility(View.INVISIBLE);


        TextView retourtoquestion =findViewById(R.id.retourview);
                 retourtoquestion.setVisibility(View.INVISIBLE);

        Toast.makeText(MainActivity.this, "Taper sur la question pour trouver la reponse ", Toast.LENGTH_SHORT).show();

        questiontext.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("john widno","your entered onclick");

                questiontext.setVisibility(View.INVISIBLE);
                answerquestion.setVisibility(View.VISIBLE);
                retourtoquestion.setVisibility(View.VISIBLE);
                //Toast.makeText(MainActivity.this, "I click the question ", Toast.LENGTH_SHORT).show();
            }
        });


/*
        answerquestion.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("john widno","your entered onclick");

                questiontext.setVisibility(View.VISIBLE);
                answerquestion.setVisibility(View.INVISIBLE);
                retourtoquestion.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "good anwer ", Toast.LENGTH_SHORT).show();
            }
        });
*/
        retourtoquestion.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("john widno","your entered onclick");
                Toast.makeText(MainActivity.this, "Taper sur la question pour trouver la reponse", Toast.LENGTH_SHORT).show();

                questiontext.setVisibility(View.VISIBLE);
                answerquestion.setVisibility(View.INVISIBLE);
                retourtoquestion.setVisibility(View.INVISIBLE);

            }
        });







    }
}