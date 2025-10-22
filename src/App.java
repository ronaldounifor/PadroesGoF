public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(2);
        Triangulo triangulo = new Triangulo(2, 2);

        calcularImportante(new TrianguloQuadradoAdaptador(triangulo));
    }

    public static void calcularImportante(Quadrado quadrado) {
        double area = quadrado.getArea();
        System.out.println(area);
    }
}