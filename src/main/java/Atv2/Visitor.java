package Atv2;


import Atv2.Itens.ProdutoFisico;
import Atv2.Itens.Servico;

public interface Visitor {
        void visitar(ProdutoFisico produto);
        void visitar(Servico servico);
    }

