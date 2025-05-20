package br.edu.ifpb.ads.padroes.atv1.atv2;

public class LicencaDeSoftware implements Item {
    private String nome;
    private double valor;

    public LicencaDeSoftware(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public Object accept(Visitor visitor) {
        // Aqui precisaríamos adicionar um novo método visit na interface Visitor
        // Como isso não é possível sem modificar a interface, usamos uma adaptação
        if (visitor instanceof LicencaVisitor) {
            return ((LicencaVisitor) visitor).visit(this);
        }
        // Caso o visitante não suporte licenças, retornamos um valor padrão
        return null;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}