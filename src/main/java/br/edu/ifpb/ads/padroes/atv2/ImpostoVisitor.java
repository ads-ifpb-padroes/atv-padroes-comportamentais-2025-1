package br.edu.ifpb.ads.padroes.atv2;

public class ImpostoVisitor implements Visitor {
   private double totalImposto = 0.0;

    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;
        System.out.printf("Imposto Produto Físico [%s]: R$ %.2f\n", produto.getNome(), imposto);
        totalImposto += imposto;
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.printf("Imposto Serviço [%s]: R$ %.2f\n", servico.getNome(), imposto);
        totalImposto += imposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
