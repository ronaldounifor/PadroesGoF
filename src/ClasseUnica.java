public class ClasseUnica {
    private static ClasseUnica minhaInstancia;

    private ClasseUnica() { }

    public static synchronized ClasseUnica getInstancia() {
        if(minhaInstancia == null)
            minhaInstancia = new ClasseUnica(); 

        return minhaInstancia;
    }

    public void algumaCoisa() {}
}