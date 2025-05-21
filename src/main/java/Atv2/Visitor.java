package Atv2;


    public interface Visitor {
        void visitar(ProdutoFisico produto);
        void visitar(Servico servico);
    }

