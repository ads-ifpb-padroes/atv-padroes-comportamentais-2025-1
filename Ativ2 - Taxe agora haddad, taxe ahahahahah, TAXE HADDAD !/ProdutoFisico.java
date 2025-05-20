package refatoracao.atv2;

public class ProdutoFisico implements Item {
    private final String nome;
    private final double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarProdutoFisico(this);
    }
}
