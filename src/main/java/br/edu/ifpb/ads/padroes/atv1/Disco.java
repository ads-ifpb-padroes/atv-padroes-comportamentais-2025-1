package br.edu.ifpb.ads.padroes.atv1;

public class Disco {

    private String artista;
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Disco(String artista, String titulo, String genero, int anoLancamento) {
        this.artista = artista;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
