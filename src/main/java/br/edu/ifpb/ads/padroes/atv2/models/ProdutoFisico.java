package br.edu.ifpb.ads.padroes.atv2.models;

import br.edu.ifpb.ads.padroes.atv2.visitors.ProdutoVisitor;

public class ProdutoFisico implements Produto {
  private double basePrice;
  private Double weight;
  private String name;

  public ProdutoFisico(String name, Double weight, double basePrice) {
    this.name = name;
    this.basePrice = basePrice;
    this.weight = weight;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
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

  @Override
  public void accept(ProdutoVisitor visitor) {
    visitor.visit(this);
  }
}
