import java.time.LocalDate;

public class RequisicaoCompraCopia extends RequisicaoCompra {

    private String estado;
    private LocalDate data;
    private String oficio;
    private Livro livro;
    private Utilizador utilizador;

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador,
                                 String estado1, LocalDate data1, String oficio1, Livro livro1, Utilizador utilizador1) {
        super(estado, data, oficio, livro, utilizador);
        this.estado = estado1;
        this.data = data1;
        this.oficio = oficio1;
        this.livro = livro1;
        this.utilizador = utilizador1;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String getOficio() {
        return oficio;
    }

    @Override
    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    @Override
    public Livro getLivro() {
        return livro;
    }

    @Override
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public Utilizador getUtilizador() {
        return utilizador;
    }

    @Override
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
