package br.edu.ifpb.ads.padroes.atv2;
import br.edu.ifpb.ads.padroes.atv2.Itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Itens.Servico;

public interface Visitor {
    void visitar(ProdutoFisico produto);
    void visitar(Servico servico);
}
