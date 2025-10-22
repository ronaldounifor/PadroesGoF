public class TrianguloQuadradoAdaptador extends Quadrado {
    private Triangulo triangulo;

    public TrianguloQuadradoAdaptador(double lado) {
        this.triangulo = new Triangulo(lado, lado);
    }

    public TrianguloQuadradoAdaptador(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public double getArea() {
        return triangulo.getArea()*2;
    }
}
