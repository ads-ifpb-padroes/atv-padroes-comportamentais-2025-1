package ativ2;

public class Servico implements TiposServico{
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double aceitar(Visitante visitante) {
        return visitante.visitar(this);
    }
}
