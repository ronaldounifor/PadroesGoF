import java.util.ArrayList;

public class Venda {
    private ArrayList<LinhaVenda> linhas;

    public Venda() {
        linhas = new ArrayList<>();
    }

    public void addProduto(Produto p, int qtde) {
        linhas.add(new LinhaVenda(p, qtde));
    }

    public double getTotal() {
        double total = 0;
        for (LinhaVenda linhaVenda : linhas)
            total += linhaVenda.getSubtotal();
        return total;
    }
}
