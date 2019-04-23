import java.util.ArrayList;

public class Repositorio {

    public Repositorio() {
    }

    ArrayList<Notificacao> ListaNot = new ArrayList<>();
    ArrayList<Requisicao> ListaReq= new ArrayList<>();
    ArrayList<Copia> ListaCop = new ArrayList<>();
    ArrayList<Utilizador> ListaUti = new ArrayList<>();
    ArrayList<Livro>ListaLiv= new ArrayList<>();
    ArrayList<Emprestimo> ListaEmp= new ArrayList<>();
    ArrayList<TipoUtilizador>ListaTipoUti= new ArrayList<>();
    ArrayList<Devolucao> ListaDev= new ArrayList<>();
    ArrayList<Coima> ListaCoima = new ArrayList<>();

    public void adicionaCoima(Coima coima)
    {
        ListaCoima.add(coima);
    }

    public void adicionaCopia(Copia copia)
    {
        ListaCop.add(copia);
    }

    public void adicionaDevolucao(Devolucao devolucao)
    {
        ListaDev.add(devolucao);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        ListaEmp.add(emprestimo);
    }

    public void adicionaEncomenda(Encomenda encomenda) {}

    public void adicionaUtilizador(Utilizador utilizador)
    {
        ListaUti.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        ListaTipoUti.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao)
    {
        ListaReq.add(requisicao);
    }



    public void adicionaLivro(Livro livro)
    {
        ListaLiv.add(livro);
    }



    public void adicionaNotificacao(Notificacao notificacao)
    {
        ListaNot.add(notificacao);
    }



    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r)
    {

        for(int x = 0; x<ListaEmp.size();x++)
        {
            if(ListaEmp.get(x).getRequisicao()==r)
                return ListaEmp.get(x);
        }
        return null;
    }
}