package com.example.estacio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

public class CadastrarAlunos extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtMatricula;
    private EditText edtPeriodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_alunos);


        edtNome = (EditText)findViewById(R.id.edtNome);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtMatricula = (EditText)findViewById(R.id.edtMatricula);
        edtPeriodo = (EditText)findViewById(R.id.edtPeriodo);

       // Veja ai lucas
    }

    public void validaCampos() {



    }


}