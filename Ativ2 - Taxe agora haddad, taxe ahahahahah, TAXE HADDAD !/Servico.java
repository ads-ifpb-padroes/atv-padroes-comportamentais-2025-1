package refatoracao.atv2;

public class Servico implements Item {
    private final String nome;
    private final double valor;

    public Servico(String nome, double valor) {
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
        visitor.visitarServico(this);
    }
}
