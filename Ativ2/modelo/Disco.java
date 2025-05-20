package refatoracao.modelo;

public class Disco {
    private String artista;
    private String titulo;
    private String genero;
    private int ano;

    public Disco(String artista, String titulo, String genero, int ano) {
        this.artista = artista;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }
}