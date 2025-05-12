package br.edu.ifpb.ads.padroes.atv1.interest;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteresseTitulo implements Interesse {
    private String titulo;

    public InteresseTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean PossuiInteresse(Disco disco) {
        return disco.getTitulo().contains(titulo);
    }
}