package br.edu.ifpb.ads.padroes.atv1.refactor.Interesse;

import br.edu.ifpb.ads.padroes.atv1.refactor.Disco;

public class InteressePorArtista implements CriterioInteresse {
    private String artista;

    public InteressePorArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getArtista().toLowerCase().contains(artista.toLowerCase());
    }
}
