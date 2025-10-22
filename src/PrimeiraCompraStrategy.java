public class PrimeiraCompraStrategy extends Strategy {

    public PrimeiraCompraStrategy(Venda v) {
            super(v);
    }

    @Override
    void aplicarDesconto() {
        v.setTotal(v.getTotal() - 50);
    }
    
}
