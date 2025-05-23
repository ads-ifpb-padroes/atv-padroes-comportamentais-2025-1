package br.edu.ifpb.ads.padroes.atv2.models;

import br.edu.ifpb.ads.padroes.atv2.visitors.ProdutoVisitor;

public class ProdutoServico implements Produto {
  private double basePrice;
  private String name;
  private int durationInDays;
  private String providerName;

  public ProdutoServico(String name, double basePrice, int durationInDays, String providerName) {
    this.name = name;
    this.basePrice = basePrice;
    this.durationInDays = durationInDays;
    this.providerName = providerName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }

  public int getDurationInDays() {
    return durationInDays;
  }

  public void setDurationInDays(int durationInDays) {
    this.durationInDays = durationInDays;
  }

  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  @Override
  public void accept(ProdutoVisitor visitor) {
    visitor.visit(this);
  }
}
