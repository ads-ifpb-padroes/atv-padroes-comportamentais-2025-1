package refatoracao.atv2;

public interface Item {
    void aceitar(Visitor visitor);
    double getValor();
    String getNome();
}
