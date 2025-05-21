package br.edu.ifpb.ads.padroes.atv2;

public class RelatorioImpostoVisitor implements Visitor {
    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;
        System.out.printf("Imposto do produto \"%s\": R$ %.2f%n", produto.getNome(), imposto);
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.printf("Imposto do serviço \"%s\": R$ %.2f%n", servico.getDescricao(), imposto);
    }
}
