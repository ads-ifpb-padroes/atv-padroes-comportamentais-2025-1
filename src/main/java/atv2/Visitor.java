package atv2;

public interface Visitor {
    void visitarProdutoFisico(ProdutoFisico produto);
    void visitarServico(Servico servico);
}
