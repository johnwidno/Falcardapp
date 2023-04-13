package com.example.flashcard;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtquestion = findViewById(R.id.questiontextview);
        TextView txtanswer1 =findViewById(R.id.txtVanswer1);
        txtanswer1.setVisibility(View.INVISIBLE);

        TextView txtanswer2 =findViewById(R.id.txtVanswer2);
        txtanswer2.setVisibility(View.INVISIBLE);

        TextView txtanswer3 =findViewById(R.id.txtVanswer3);
        txtanswer3.setVisibility(View.INVISIBLE);


        ImageView previoustbnt= findViewById(R.id.previousbtn);
        ImageView nextbtn  =  findViewById(R.id.NextBtn);

        Toast.makeText(this, "cliquer sur la question pour trouver la reponse  ", Toast.LENGTH_SHORT).show();



        ActivityResultLauncher<Intent> activityLancher = registerForActivityResult(


                new ActivityResultContracts.StartActivityForResult(), result -> {

                    Log.d("data ", "onActivityResult:  from addactivity");

                    if(result.getResultCode()==78){

                        Intent intent = result.getData();
                        if(intent!=null){

                            String question = intent.getStringExtra("question");
                            txtquestion.setText(question);

                            String answer1 = intent.getStringExtra("answer1");
                            txtanswer1.setText(answer1);

                            String answer2 = intent.getStringExtra("answer2");
                            txtanswer2.setText(answer2);

                            String answer3 = intent.getStringExtra("answer3");
                            txtanswer3.setText(answer3);

                        }

                    }

                });










        txtquestion.setOnClickListener(view -> {
            txtanswer1.setVisibility(View.VISIBLE);
            txtanswer2.setVisibility(View.VISIBLE);
            txtanswer3.setVisibility(View.VISIBLE);

            Toast.makeText( MainActivity.this, "cliquer sur la question pour trouver la reponse  ", Toast.LENGTH_SHORT).show();

        });


       ImageView btnadd =  findViewById(R.id.btnaddnew);

        btnadd.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, activity_add_card.class);
            activityLancher.launch(intent);

        });

        previoustbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Non disponible pour l'instant  ", Toast.LENGTH_SHORT).show();

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Non disponible pour l'instant  ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}