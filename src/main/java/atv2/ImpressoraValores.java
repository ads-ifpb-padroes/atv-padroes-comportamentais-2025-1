package atv2;

public class ImpressoraValores implements Visitor {

    @Override
    public void visitarProdutoFisico (ProdutoFisico produto) {
        System.out.println("Valor do produto: R$ " + produto.getValor());
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.println("Valor do serviço: R$ " + servico.getValor());
    }
}
