package br.edu.ifpb.ads.padores.atv2;

public class Servico implements Item {

    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(ItemVisitor visitor) {
        visitor.visitServico(this);
    }
}
