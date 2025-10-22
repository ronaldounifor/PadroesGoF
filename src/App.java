public class App {
    public static void main(String[] args) throws Exception {
        Venda v = new Venda();

        v.adicionarProduto(new Produto("Uva", 50));
        v.adicionarProduto(new Produto("Maca", 50));

        v.adicionarStrategy(new CupomStrategy(v, new Cupom(0.3)));
        // v.adicionarStrategy(new BlackFridayStrategy(v));
        v.adicionarStrategy(new PrimeiraCompraStrategy(v));

        v.imprimir();
    }
}