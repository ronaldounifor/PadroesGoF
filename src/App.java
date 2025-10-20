public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(2, 2);
        // Quadrado quadrado = new Quadrado(2);

        construindoImportante(new Adapter(2));

    }

    public static void construindoImportante(Quadrado q) {
        //algo extremamente importante
    }
}
