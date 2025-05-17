package br.edu.ifpb.ads.padroes.atv1.interest;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteresseArtista implements Interesse {
    private String artista;

    public InteresseArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean PossuiInteresse(Disco disco) {
        return disco.getArtista().contains(artista);
    }
}