package Atv2;

import Atv2.Itens.ProdutoFisico;
import Atv2.Itens.Servico;

public class Imprimir implements Visitor{
    @Override
    public void visitar(ProdutoFisico produto) {
        System.out.println("O valor  é: R$"+ produto.getValor());
    }

    @Override
    public void visitar(Servico servico) {
        System.out.println("O valor é: R$"+ servico.getValor());
    }
}
