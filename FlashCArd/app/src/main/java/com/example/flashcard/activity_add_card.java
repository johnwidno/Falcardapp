package com.example.flashcard;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class activity_add_card extends AppCompatActivity {


    private View activity_add_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        TextView btnsave =findViewById(R.id.btnsave);
        ImageView cancelbtn =findViewById(R.id.btncancel);
        TextView edittextquestion = findViewById(R.id.editquestion);
        TextView edtanswer1 = findViewById(R.id.editanswer1);
        TextView edtanswer2 = findViewById(R.id.editanswer2);
        TextView edtanswer3 = findViewById(R.id.editanswer3);


        btnsave.setOnClickListener(view -> {
            if(edittextquestion.getText().toString().isEmpty()){
               Snackbar nackbar;
                 Snackbar.make(btnsave,"Desolé !!!, Un ou plusieur champs vide", Snackbar.LENGTH_LONG).show();

            }else if (edtanswer1.getText().toString().isEmpty()){

                Snackbar.make(btnsave,"Desolé !!!, Un ou plusieur champs vide", Snackbar.LENGTH_LONG).show();

            }else if (edtanswer2.getText().toString().isEmpty()){


                Snackbar.make(btnsave,"Desolé !!!, Un ou plusieur champs vide", Snackbar.LENGTH_LONG).show();
            }else if (edtanswer3.getText().toString().isEmpty()){

                Snackbar.make(btnsave,"Desolé !!!, Un ou plusieur champs vide", Snackbar.LENGTH_LONG).show();


            }else {
                Intent intent = new Intent();
                intent.putExtra("question",edittextquestion.getText().toString());
                intent.putExtra("answer1",edtanswer1.getText().toString());
                intent.putExtra("answer2",edtanswer2.getText().toString());
                intent.putExtra("answer3",edtanswer3.getText().toString());

                setResult(78,intent);
                finish();
           }
        });







        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittextquestion.setText("");
                edtanswer1.setText("");
                edtanswer2.setText("");
                edtanswer3.setText("");
            }
        });











    }
}