package br.edu.ifpb.ads.padroes.atv1.refactor.Interesse;

import br.edu.ifpb.ads.padroes.atv1.refactor.Disco;

public class InteressePorGenero implements CriterioInteresse {
    private String genero;

    public InteressePorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getGenero().toLowerCase().contains(genero.toLowerCase());
    }
}
