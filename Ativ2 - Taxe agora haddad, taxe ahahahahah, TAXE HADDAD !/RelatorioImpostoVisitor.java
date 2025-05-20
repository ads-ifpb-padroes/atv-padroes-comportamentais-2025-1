package refatoracao.atv2;

public class RelatorioImpostoVisitor implements Visitor {
    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.16;
        System.out.printf("Imposto sobre produto físico '%s': R$ %.2f%n", produto.getNome(), imposto);
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.printf("Imposto sobre serviço '%s': R$ %.2f%n", servico.getNome(), imposto);
    }
}
