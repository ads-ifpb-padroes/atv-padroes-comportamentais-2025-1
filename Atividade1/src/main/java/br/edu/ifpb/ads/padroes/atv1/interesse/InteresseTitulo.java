package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;

import java.util.List;

public class InteresseTitulo implements Interesse{
    private String titulo;

    public InteresseTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean possuiInteresse(Disco disco) {
        if (this.titulo.equals(disco.getTitulo())) {
            return true;
        }
        return false;
    }
}
