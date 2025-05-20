package br.edu.ifpb.ads.padroes.atv1.atv2;

public class RelatorioDeImpostosVisitor implements Visitor {
    private static final double TAXA_IMPOSTO_PRODUTO_FISICO = 0.10; // 10%
    private static final double TAXA_IMPOSTO_SERVICO = 0.15; // 15%

    public Object visit(ProdutoFisico produto) {
        double valorImposto = produto.getValor() * TAXA_IMPOSTO_PRODUTO_FISICO;
        return valorImposto;
    }

    public Object visit(Servico servico) {
        double valorImposto = servico.getValor() * TAXA_IMPOSTO_SERVICO;
        return valorImposto;
    }
}