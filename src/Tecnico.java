public class Tecnico {
    private String nome;
    private Double salario;
    public Tecnico() {
        this.nome = "Nome do Tecnico";
        this.salario = 0.0;
    }
    public Tecnico(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
