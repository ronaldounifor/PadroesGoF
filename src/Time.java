import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores;
    private String cor;
    private String nome;
    private Tecnico tecnico;

    public Time() {
        jogadores = new ArrayList<>();
        nome = "Nome do Time";
        cor = "Roxo";
        tecnico = new Tecnico();
    }

    public Time(Tecnico tecnico, ArrayList<Jogador> jogadores, String cor, String nome) {
        this.jogadores = jogadores;
        this.cor = cor;
        this.tecnico = tecnico;
        this.nome = nome;
        try {
            // SIMULAR DEMORA DE 5 segundos
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error: El hilo fue interrumpido.");
        }
    }
    
    public Time clone() {
        Time clone = new Time();
        clone.setNome(this.getNome());
        clone.setCor(this.getCor());
        clone.setTecnico(this.getTecnico());
        clone.setJogadores(this.getJogadores());
        return clone;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
    
    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String time = nome+" - Técnico: "+tecnico.getNome();
        for (Jogador jogador : jogadores) {
            time += "\n";
            time += jogador.getNome()+" ("+jogador.getPosicao()+")";
        }
        return time;
    }
}
