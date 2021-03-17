package dominio.entidades;

public class GnrPerguntas {

    private int codigoGnrPerguntas;
    private String descricaoGnrPerguntas;
    private int gnrClassificacaoPerguntasCodigoGnrClassificao_perguntas;
    private int gnrModeloRespostasCodigoGnrRespostas;

    public int getCodigoGnrPerguntas() {
        return codigoGnrPerguntas;
    }

    public void setCodigoGnrPerguntas(int codigoGnrPerguntas) {
        this.codigoGnrPerguntas = codigoGnrPerguntas;
    }

    public String getDescricaoGnrPerguntas() {
        return descricaoGnrPerguntas;
    }

    public void setDescricaoGnrPerguntas(String descricaoGnrPerguntas) {
        this.descricaoGnrPerguntas = descricaoGnrPerguntas;
    }

    public int getGnrClassificacaoPerguntasCodigoGnrClassificao_perguntas() {
        return gnrClassificacaoPerguntasCodigoGnrClassificao_perguntas;
    }

    public void setGnrClassificacaoPerguntasCodigoGnrClassificao_perguntas(int gnrClassificacaoPerguntasCodigoGnrClassificao_perguntas) {
        this.gnrClassificacaoPerguntasCodigoGnrClassificao_perguntas = gnrClassificacaoPerguntasCodigoGnrClassificao_perguntas;
    }

    public int getGnrModeloRespostasCodigoGnrRespostas() {
        return gnrModeloRespostasCodigoGnrRespostas;
    }

    public void setGnrModeloRespostasCodigoGnrRespostas(int gnrModeloRespostasCodigoGnrRespostas) {
        this.gnrModeloRespostasCodigoGnrRespostas = gnrModeloRespostasCodigoGnrRespostas;
    }
}
