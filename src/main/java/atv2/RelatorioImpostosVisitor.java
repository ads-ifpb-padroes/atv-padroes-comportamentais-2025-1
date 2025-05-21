package atv2;

public class RelatorioImpostosVisitor implements Visitor {
    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;
        System.out.println("Imposto sobre produto físico: R$ " + imposto);
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.println("Imposto sobre serviço: R$ " + imposto);
    }
}
