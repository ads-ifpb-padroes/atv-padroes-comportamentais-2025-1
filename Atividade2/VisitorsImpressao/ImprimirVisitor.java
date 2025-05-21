package VisitorsImpressao;

import produto.ProdutoFisico;
import produto.Servico;

public interface ImprimirVisitor {
    public void imprimir(ProdutoFisico produto);
    public void imprimir(Servico produto);
}
