import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores;
    private String cor;
    private Tecnico tecnico;

    public Time() {
        //instancia basica
    }

    public Time(Tecnico tecnico, ArrayList<Jogador> jogadores, String cor) {
        this.jogadores = jogadores;
        this.cor = cor;
        this.tecnico = tecnico;
    }

    public Time clone() {
        Time clone = new Time();
        clone.setCor(this.getCor());
        clone.setTecnico(this.getTecnico());
        clone.setJogadores(this.getJogadores());
        return clone;
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
}
