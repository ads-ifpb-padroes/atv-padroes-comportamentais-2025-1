package atv2;

public class PrintVisitor implements ItemVisitor<Void>{
    @Override
    public Void visit(ProdutoFisico produto) {
        System.out.printf("Produto: %s – Valor: R$ %.2f%n", produto.getNome(), produto.getValor());
        return null;
    }

    @Override
    public Void visit(Servico servico) {
        System.out.printf("Serviço: %s – Valor: R$ %.2f%n", servico.getDescricao(), servico.getValor());
        return null;
    }
}
