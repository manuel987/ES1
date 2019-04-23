public class TipoUtilizador {
    private String Descricao;
    private int prazoEmprestimo;

    public TipoUtilizador(String descricao, int prazoEmprestimo) {
        Descricao = descricao;
        this.prazoEmprestimo = prazoEmprestimo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public void setPrazoEmprestimo(int prazoEmprestimo) {
        this.prazoEmprestimo = prazoEmprestimo;
    }
}
