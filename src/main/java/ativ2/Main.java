package ativ2;

public class Main {
    public static void main(String[] args) {
        TiposServico produto= new ProdutoFisico(100);
        TiposServico servico= new Servico(200);
        Visitante calImposto= new VisitanteRegrasCalculoImposto();
        Visitante imprimir= new RegrasImprimir();

        produto.aceitar(calImposto);
        servico.aceitar(calImposto);

        produto.aceitar(imprimir);
        servico.aceitar(imprimir);
    }
}
