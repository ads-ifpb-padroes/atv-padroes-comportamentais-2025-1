package br.edu.ifpb.ads.padroes.atv1.refactor.Interesse;

import br.edu.ifpb.ads.padroes.atv1.refactor.Disco;

public class InteressePorDisco implements CriterioInteresse {
    private String tituloDisco;

    public InteressePorDisco(String tituloDisco) {
        this.tituloDisco = tituloDisco;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getTitulo().toLowerCase().contains(tituloDisco.toLowerCase());
    }
}
