public class BlackFridayStrategy extends Strategy {

    public BlackFridayStrategy(Venda v) {
            super(v);
    }
    
    @Override
    void aplicarDesconto() {
        v.setTotal(v.getTotal() - 10);
    }
    
}
