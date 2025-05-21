package br.edu.ifpb.ads.padroes.atv2;

public class ImpressaoVisitor implements Visitor {
    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        System.out.printf("Produto: %s - Valor: R$ %.2f%n", produto.getNome(), produto.getValor());
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.printf("Serviço: %s - Valor: R$ %.2f%n", servico.getDescricao(), servico.getValor());
    }
}
