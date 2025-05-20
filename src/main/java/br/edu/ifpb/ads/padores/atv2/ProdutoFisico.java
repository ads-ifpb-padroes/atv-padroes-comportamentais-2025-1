package br.edu.ifpb.ads.padores.atv2;

public class ProdutoFisico implements Item {

    private double valor;

    public ProdutoFisico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(ItemVisitor visitor) {
        visitor.visitProdutoFisico(this);
    }

}
