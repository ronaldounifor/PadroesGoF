import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Deadpool", "Goleiro", 5.0));
        jogadores.add(new Jogador("Marole", "Zagueiro", 3.5));
        jogadores.add(new Jogador("Buisi", "Meio-campo", 4.0));
        jogadores.add(new Jogador("Pikachu", "Atacante", 7.0));
        jogadores.add(new Jogador("Davi Vieira", "Lateral Direito", 4.5));
        jogadores.add(new Jogador("Theodomiro", "Zagueiro", 4.0));
        jogadores.add(new Jogador("Bob Esponja", "Goleiro", 3.0));
        jogadores.add(new Jogador("Tiririca", "Ponta Esquerda", 5.5));
        jogadores.add(new Jogador("Tirulipa", "Atacante", 6.0));
        jogadores.add(new Jogador("Wolverine", "Zagueiro", 8.0));

        Time timeOriginal = new Time(new Tecnico("Zagalo", 2000000.0), jogadores, "Roxo", "Ah Selessão");

        Time timeCopia = timeOriginal.clone();

        timeOriginal.getJogadores().get(0).setNome("EEEEEEEEEEEEITA");
        
        System.out.println(timeOriginal);
        System.out.println("##########################################################################");

        System.out.println(timeCopia);


        
    }
}
