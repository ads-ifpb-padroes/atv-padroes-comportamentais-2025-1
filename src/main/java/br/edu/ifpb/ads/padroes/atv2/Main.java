package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.models.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.models.ProdutoServico;
import br.edu.ifpb.ads.padroes.atv2.visitors.JsonLog;
import br.edu.ifpb.ads.padroes.atv2.visitors.RegularTax;
import br.edu.ifpb.ads.padroes.atv2.visitors.XmlLog;

public class Main {
  public static void main(String[] args) {
    ProdutoFisico produtoFisico = new ProdutoFisico("carro", 40.0, 1_000.0);
    ProdutoServico servico = new ProdutoServico("show de lambada", 3_000.00, 1, "sidney magal");

    RegularTax regularTax = new RegularTax();
    JsonLog jsonLog = new JsonLog();
    XmlLog xmlLog = new XmlLog();

    produtoFisico.accept(regularTax);
    servico.accept(regularTax);

    // diferentes implementações para gerar relatorio
    produtoFisico.accept(jsonLog);
    servico.accept(jsonLog);

    servico.accept(xmlLog);
    produtoFisico.accept(xmlLog);
  }
}
