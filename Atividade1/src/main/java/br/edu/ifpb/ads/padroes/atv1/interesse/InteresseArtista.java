package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;

import java.util.List;


public class InteresseArtista implements Interesse {
    private String artista;

    public InteresseArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean possuiInteresse(Disco disco) {
        if (this.artista.equals(disco.getArtista())) {
            return true;
        }
        return false;
    }
}