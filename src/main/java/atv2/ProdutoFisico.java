package atv2;

public class ProdutoFisico implements Item{
    private String nome;
    private double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
