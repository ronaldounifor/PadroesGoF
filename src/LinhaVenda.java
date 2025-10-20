public class LinhaVenda {
    private Produto produto;
    private int quantidade;

    public LinhaVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getValor() * quantidade;
    }
}
