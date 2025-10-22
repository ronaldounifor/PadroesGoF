public abstract class Strategy {
    protected Venda v;

    public Strategy(Venda v) {
        this.v = v;
    }

    abstract void aplicarDesconto();
}