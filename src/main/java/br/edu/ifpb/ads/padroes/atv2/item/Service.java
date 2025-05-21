package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class Service implements Item {

    private String name;
    private double value;
    private String description;

    public Service(String name, double value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
