package br.edu.ifpb.ads.padroes.atv2.Itens;
import br.edu.ifpb.ads.padroes.atv2.Visitor;
import java.math.BigDecimal;

public class ProdutoFisico implements Item {
    private String nome;
    private BigDecimal valor;

    public ProdutoFisico(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
