package VisitorsImpressao;

import produto.ProdutoFisico;
import produto.Servico;

public interface Visitor {
    public void visitar(ProdutoFisico produto);
    public void visitar(Servico produto);
}
