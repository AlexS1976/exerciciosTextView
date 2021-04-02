package com.example.exerciciotextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textnome;
    private TextView textemail;
    private TextView textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textnome = findViewById(R.id.textViewRNome);
        textemail = findViewById(R.id.textViewREmail);
        textIdade = findViewById(R.id.textViewIdade);

        Bundle dados = getIntent().getExtras();
       String nome = dados.getString("nome");
       String email = dados.getString("email");
       String idade = dados.getString("idade");

      textnome.setText(nome);
      textemail.setText(email);
      textIdade.setText(idade);





    }
}