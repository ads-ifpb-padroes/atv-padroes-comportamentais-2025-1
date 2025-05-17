package atv2;

public class Servico implements Item {
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
