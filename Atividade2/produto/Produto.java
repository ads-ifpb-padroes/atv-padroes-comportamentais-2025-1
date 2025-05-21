package produto;

import VisitorsImpressao.Visitor;

public interface Produto {
    public double getPreco();
    public void aceitar(Visitor visitor);
}
