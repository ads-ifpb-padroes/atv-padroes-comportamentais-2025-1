package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.models.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.models.ProdutoServico;

public class RegularTax implements ProdutoVisitor {
  @Override
  public void visit(ProdutoFisico produto) {
    double price = produto.getBasePrice() * 1.1;
    System.out.println("Preço Total do Produto Físico: " + price);
  }

  @Override
  public void visit(ProdutoServico servico) {
    double price = servico.getBasePrice() * 1.15;
    System.out.println("Preço Total do Serviço: " + price);
  }
}
