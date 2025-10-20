public class Produto {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String descricao;
    private double valor;

    public String getDetalhes() {
        return "["+id+"]: " + descricao + " (R$ "+valor+")";
    }
    
    public double getValor() {
        return valor;
    }

    public Produto(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
}
