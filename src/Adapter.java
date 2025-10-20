public class Adapter extends Quadrado {
    private Triangulo triangulo;

    public Adapter(double lado) {
        this.triangulo = new Triangulo(lado, lado);
    }

    public double getArea() {
        return triangulo.getArea();
    }
}
