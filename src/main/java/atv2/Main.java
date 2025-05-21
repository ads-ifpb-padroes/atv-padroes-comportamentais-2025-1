package atv2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new ProdutoFisico(100.0));
        itens.add(new Servico(200.0));
        itens.add(new ProdutoFisico(80.0));
        itens.add(new Servico(150.0));

        Visitor calculadora = new CalculadoraImposto();
        Visitor impressora = new ImpressoraValores();

        System.out.println(" Valores");
        for (Item i : itens) {
            i.aceitar(impressora);
        }

        System.out.println("\n Impostos");
        for (Item i : itens) {
            i.aceitar(calculadora);
        }
    }
}
