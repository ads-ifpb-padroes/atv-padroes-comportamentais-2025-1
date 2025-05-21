package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

public class InteressadoGenero implements Interessado{
    private String genero;

    public InteressadoGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public boolean interessado(Disco disco) {
        return disco.getGenero().toLowerCase().contains(genero.toLowerCase());
    }
}
