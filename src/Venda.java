import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produtos;
    private Cupom cupom;
    private boolean blackFriday;
    private Cliente cliente;
    private ArrayList<Strategy> descontos;
    private double total;
    
    public Venda() {
        descontos = new ArrayList<>();
        cliente = new Cliente();
        produtos = new ArrayList<>();
        blackFriday = false;
        total = 0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        total += produto.getPreco();
    }

    public void adicionarStrategy(Strategy strategy) {
        descontos.add(strategy);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void aplicarDescontos() {
        for (Strategy strategy : descontos)
            strategy.aplicarDesconto();
    }

    // public double getTotalComDesconto() {
    //     double total = getTotal();

    //     if(cliente.getTipo() == "Ouro") {
    //         if(isBlackFriday())
    //             total -= 10;
                
    //         if(cliente.getHistorico().size() == 0)
    //             total -= 50;

    //         if(cupom != null)
    //             total -= cupom.getDesconto()*total;
    //     } else if(cliente.getTipo() == "Prata"){
    //          if(isBlackFriday())
    //             total -= 10;
                
    //         if(cliente.getHistorico().size() == 0)
    //             total -= 50;

    //         if(cupom != null)
    //             total -= cupom.getDesconto()*total;
    //     }


    //     return total;
    // }

    public void finalizarVenda() {
        cliente.adicionarHistorico(this);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cupom getCupom() {
        return cupom;
    }

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }
        public boolean isBlackFriday() {
        return blackFriday;
    }

    public void setBlackFriday(boolean blackFriday) {
        this.blackFriday = blackFriday;
    }

    public void imprimir() {
        System.out.println("Total: " + getTotal());
        aplicarDescontos();
        System.out.println("Total (c/desconto): " + getTotal());
    }
}