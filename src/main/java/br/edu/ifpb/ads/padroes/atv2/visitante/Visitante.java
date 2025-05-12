package br.edu.ifpb.ads.padroes.atv2.visitante;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public interface Visitante {
    void visitar(ProdutoFisico item);
    void visitar(Servico item);
}
