package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

public class InteressadoTitulo implements Interessado{
    private String titulo;

    public InteressadoTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean interessado(Disco disco) {
        return disco.getTitulo().toLowerCase().contains(titulo.toLowerCase());
    }
}
