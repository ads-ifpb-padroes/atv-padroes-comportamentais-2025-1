package br.edu.ifpb.ads.padroes.atv1;

import java.util.Objects;

public class Disco {

    private String artista;
    private String titulo;
    private String genero;
    private int anoLancamento;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return anoLancamento == disco.anoLancamento && Objects.equals(artista, disco.artista) && Objects.equals(titulo, disco.titulo) && Objects.equals(genero, disco.genero);
    }

    public Disco(String artista, String titulo, String genero, int anoLancamento) {
        this.artista = artista;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
