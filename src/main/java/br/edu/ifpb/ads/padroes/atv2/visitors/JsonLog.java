package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.models.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.models.ProdutoServico;

public class JsonLog implements ProdutoVisitor {

	@Override
	public void visit(ProdutoFisico produto) {
      System.out.print("""
          "{"name": "%s", "basePrice": %.2f, "weight": %.2f}"
          """.formatted(produto.getName(), produto.getBasePrice(), produto.getWeight()));
    }

    @Override
    public void visit(ProdutoServico servico) {
      System.out.print("""
          "{"name": "%s", "basePrice": %.2f, "durationInDays": %d, "providerName": "%s"}"
          """.formatted(servico.getName(), servico.getBasePrice(), servico.getDurationInDays(),
          servico.getProviderName()));
    }

  }
