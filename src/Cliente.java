import java.util.ArrayList;

public class Cliente {
    private ArrayList<Venda> historico;

    public Cliente() {
        historico = new ArrayList<>();
    }
    
    public void adicionarHistorico(Venda venda) {
        historico.add(venda);
    }

    public ArrayList<Venda> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Venda> historico) {
        this.historico = historico;
    }
}
