package br.edu.ifpb.ads.padroes.atv2.models;

import br.edu.ifpb.ads.padroes.atv2.visitors.ProdutoVisitor;

public interface Produto {
  void accept(ProdutoVisitor visitor);
}
