package atv2;

public class TaxVisitor implements ItemVisitor<Double> {
    @Override
    public Double visit(ProdutoFisico produto) {
        // 10% de imposto
        return produto.getValor() * 0.10;
    }

    @Override
    public Double visit(Servico servico) {
        // 15% de imposto
        return servico.getValor() * 0.15;
    }
}
