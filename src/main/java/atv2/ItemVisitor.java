package atv2;

public interface ItemVisitor <T> {
    T visit(ProdutoFisico produto);
    T visit(Servico servico);
}
