package dominio.entidades;

import java.util.Date;

public class GnrRespostasAlunos {

    private int codigoGnrRespostasAlunos;
    private Date dataGnrRespostasAlunos;
    private int gnrAlunoMatriculaGnrAluno;

    public int getCodigoGnrRespostasAlunos() {
        return codigoGnrRespostasAlunos;
    }

    public void setCodigoGnrRespostasAlunos(int codigoGnrRespostasAlunos) {
        this.codigoGnrRespostasAlunos = codigoGnrRespostasAlunos;
    }

    public Date getDataGnrRespostasAlunos() {
        return dataGnrRespostasAlunos;
    }

    public void setDataGnrRespostasAlunos(Date dataGnrRespostasAlunos) {
        this.dataGnrRespostasAlunos = dataGnrRespostasAlunos;
    }

    public int getGnrAlunoMatriculaGnrAluno() {
        return gnrAlunoMatriculaGnrAluno;
    }

    public void setGnrAlunoMatriculaGnrAluno(int gnrAlunoMatriculaGnrAluno) {
        this.gnrAlunoMatriculaGnrAluno = gnrAlunoMatriculaGnrAluno;
    }
}
