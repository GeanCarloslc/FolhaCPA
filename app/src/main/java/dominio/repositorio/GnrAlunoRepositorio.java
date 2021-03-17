package dominio.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import dominio.entidades.GnrAluno;

public class GnrAlunoRepositorio {

    private SQLiteDatabase conexao;

    public GnrAlunoRepositorio(SQLiteDatabase conexao){
        this.conexao = conexao;
    }

    public void inserir(GnrAluno gnrAluno){
        //teste
        ContentValues contentValues = new ContentValues();
        contentValues.put("MATRICULA_GNR_ALUNO", gnrAluno.getMatriculaGnrAluno());
        contentValues.put("NOME_GNR_ALUNO", gnrAluno.getNomeGnrAluno());
        contentValues.put("LOGIN_GNR_ALUNO", gnrAluno.getLoginGnrAluno());
        contentValues.put("EMAIL_GNR_ALUNO", gnrAluno.getEmailGnrAluno());
        contentValues.put("PERIODO_GNR_ALUNO", gnrAluno.getPeriodoGnrAluno());
        conexao.insertOrThrow("GNR_ALUNO", null, contentValues);

    }

}
