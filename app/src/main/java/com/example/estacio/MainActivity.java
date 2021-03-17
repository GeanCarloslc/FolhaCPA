package com.example.estacio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import database.FolhaCPAOpenHelper;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private FolhaCPAOpenHelper folhaCPAOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CriarConexao();
    }

    public void cadastrarUsuario( View view ) {

        Intent it = new Intent( MainActivity.this, CadastrarAlunos.class );
        startActivity(it);


    }

    public void CriarConexao(){

        try {

            folhaCPAOpenHelper = new FolhaCPAOpenHelper(this);

            conexao = folhaCPAOpenHelper.getWritableDatabase();
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Deu certo");
            dlg.setNeutralButton("Ok", null);
            dlg.show();

        } catch (SQLException ex){

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Erro");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();

        }
    }
}