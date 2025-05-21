package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

public class InteressadoArtista implements Interessado{
    private String artista;

    public InteressadoArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean interessado(Disco disco) {
        return disco.getArtista().toLowerCase().contains(artista.toLowerCase());
    }
}
