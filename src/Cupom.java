
public class Cupom {
    /**
     * Percentil (0..1)
     */
    private double desconto;

    public Cupom(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
