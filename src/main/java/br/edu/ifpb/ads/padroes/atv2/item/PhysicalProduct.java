package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class PhysicalProduct implements Item {

    private String name;
    private double value;
    private String manufacturer;

    public PhysicalProduct(String name, double value, String manufacturer) {
        this.name = name;
        this.value = value;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
