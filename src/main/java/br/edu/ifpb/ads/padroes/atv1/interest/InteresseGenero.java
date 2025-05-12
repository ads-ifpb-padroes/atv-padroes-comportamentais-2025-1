package br.edu.ifpb.ads.padroes.atv1.interest;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteresseGenero implements Interesse {
    private String genero;

    public InteresseGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean PossuiInteresse(Disco disco) {
        return disco.getGenero().contains(genero);
    }
}