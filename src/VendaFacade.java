import java.util.Arrays;
import java.util.List;

public class VendaFacade {
    private Venda venda;
    private List<Produto> produtos = Arrays.asList(
        new Produto(0, "Calça Style", 20),
        new Produto(1, "Camisa Style", 15),
        new Produto(2, "Micro-ondas", 200)
    );

    //iniciarVenda
    public void iniciarVenda() {
        venda = new Venda();
    }
    //adicionarProdutos
    public void adicionarProdutos(int id, int quantidade) {
        venda.addProduto(produtos.get(id), quantidade);
    }

    //getTotal
    public double getTotal() {
        return venda.getTotal();
    }

    //getDetalhes
    public String getDetalhes(int id) {
        for (Produto produto : produtos)
            if(produto.getId() == id)
                return produto.getDetalhes();
        
        return "404";
    }
}
