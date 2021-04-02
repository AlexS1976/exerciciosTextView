package com.example.exerciciotextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
// variaveis criadas para receber as informacoes que o usuario vai inserir
    public EditText nome;
    public EditText email;
    private TextView resultado;
    private Button enviar;
    private EditText idade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// vincula as variaveis com os objetos do layout

        nome = findViewById(R.id.editTextNome);
        email = findViewById(R.id.editTextEmail);
        resultado = findViewById(R.id.textResultado);
        enviar = findViewById(R.id.buttonEnviar);
        idade = findViewById(R.id.editTextIdade);

        // variavel do botao recebe metodo para captar o click do botao

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // recebe os dados digitados pelo usuario
                String textoNome = nome.getText().toString();
                String textoEmail = email.getText().toString();
                String numeroIdade = idade.getText().toString();

                // instanciar um objeto intet e passar contexto e destino para abrir outra activity
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                // metodo putextra salva e prepara os dados para serem recuperados na outra attivity
                intent.putExtra("nome", textoNome);
                intent.putExtra("email", textoEmail);
                intent.putExtra("idade", numeroIdade);

               startActivity(intent);

            }
        });


    }

    //public void enviarDados(View view){

        //String textoNome = nome.getText().toString();
       // String textoEmail = email.getText().toString();

        //resultado.setText(textoNome + ": " + textoEmail);
   // }

    public void limpar(View view){

        nome.setText("");
        email.setText("");
        resultado.setText("");

        Toast.makeText(this, "Texto apagado", Toast.LENGTH_SHORT).show();
    }
}