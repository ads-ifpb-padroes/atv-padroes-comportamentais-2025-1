package br.edu.ifpb.ads.padroes.atv1.atv2;

import br.edu.ifpb.ads.padroes.atv1.atv2.Itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv1.atv2.Itens.Servico;

public class ImprimirItens implements Visitor{

    @Override
    public void visitar(ProdutoFisico produto) {
        System.out.println("O valor desse produto é: R$"+ produto.getValor());
    }

    @Override
    public void visitar(Servico servico) {
        System.out.println("O valor desse serviço é: R$"+ servico.getValor());
    }

}
