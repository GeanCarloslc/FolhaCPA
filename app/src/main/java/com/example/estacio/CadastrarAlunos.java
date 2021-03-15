package com.example.estacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
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
    }

    public void validaCampos() {

        String nome = edtNome.getText().toString();
        String email = edtEmail.getText().toString();
        String matricula = edtMatricula.getText().toString();
        String periodo = edtPeriodo.getText().toString();

    }

    private boolean isCampoVazio( String valor ){

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;

    }


}