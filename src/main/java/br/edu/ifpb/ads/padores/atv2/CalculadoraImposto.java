package br.edu.ifpb.ads.padores.atv2;

public class CalculadoraImposto implements ItemVisitor {

    private double totalImposto = 0;

    @Override
    public void visitProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;
        totalImposto += imposto;
        System.out.println("Imposto Produto Físico: " + imposto);
    }

    @Override
    public void visitServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        totalImposto += imposto;
        System.out.println("Imposto Serviço: " + imposto);
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
