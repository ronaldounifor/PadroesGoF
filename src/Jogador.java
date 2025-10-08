public class Jogador {
    private String nome;
    private String posicao;
    private Double salario;
    public Jogador() {
    }
    public Jogador(String nome, String posicao, Double salario) {
        this.nome = nome;
        this.posicao = posicao;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Jogador clone() {
        Jogador clone = new Jogador();
        clone.setNome(this.nome);
        clone.setSalario(this.salario);
        clone.setPosicao(this.posicao);
        return clone;
    }
}
