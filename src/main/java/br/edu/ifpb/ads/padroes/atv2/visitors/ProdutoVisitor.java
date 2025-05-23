package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.models.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.models.ProdutoServico;

public interface ProdutoVisitor {
  void visit(ProdutoFisico produto);
  void visit(ProdutoServico servico);
}
