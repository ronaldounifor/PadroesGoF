

public class CupomStrategy extends Strategy {
    private Cupom cupom;
    
    public CupomStrategy(Venda v, Cupom cupom) {
        super(v);
        this.cupom = cupom;
    }
    
        @Override
    void aplicarDesconto() {
       v.setTotal(v.getTotal() - cupom.getDesconto()*v.getTotal());
    }
    
}
