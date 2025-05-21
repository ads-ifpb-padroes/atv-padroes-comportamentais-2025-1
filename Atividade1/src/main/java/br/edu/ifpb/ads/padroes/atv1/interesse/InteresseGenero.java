package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;

import java.util.List;

public class InteresseGenero implements Interesse{
    private String genero;

    public InteresseGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public boolean possuiInteresse(Disco disco) {
        if (this.genero.equals(disco.getGenero())) {
            return true;
        }
        return false;
    }
}
