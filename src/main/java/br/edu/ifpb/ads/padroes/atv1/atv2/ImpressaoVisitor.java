package br.edu.ifpb.ads.padroes.atv1.atv2;

public class ImpressaoVisitor implements Visitor {

    public Object visit(ProdutoFisico produto) {
        return String.format("Produto Físico: %s - Valor: R$ %.2f",
                produto.getNome(), produto.getValor());
    }

    public Object visit(Servico servico) {
        return String.format("Serviço: %s - Valor: R$ %.2f",
                servico.getNome(), servico.getValor());
    }
}