package VisitorsRelatorio;

import produto.ProdutoFisico;
import produto.Servico;

public interface CalculoVisitor {
    public void calcular(ProdutoFisico produto);
    public void calcular(Servico servico);
}
