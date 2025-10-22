public class TrianguloPentagonoAdaptador extends Pentagono {
    private Triangulo triangulo;

    public double getArea() {
        return triangulo.getArea()*5;
    }
}
