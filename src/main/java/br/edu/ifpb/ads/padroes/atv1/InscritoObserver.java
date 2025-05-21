package br.edu.ifpb.ads.padroes.atv1;

public class InscritoObserver implements Observer {
    private String tituloInteresse;
    private String artistaInteresse;
    private String generoInteresse;
    private FormaNotificacao formaNotificacao;

    public InscritoObserver(String titulo, String artista, String genero, FormaNotificacao forma) {
        this.tituloInteresse = titulo;
        this.artistaInteresse = artista;
        this.generoInteresse = genero;
        this.formaNotificacao = forma;
    }
    @Override
    public void atualizar(Disco disco) {
        boolean notificar = false;

        if (tituloInteresse != null && disco.getTitulo().equalsIgnoreCase(tituloInteresse)) {
            notificar = true;
        }

        if (artistaInteresse != null && disco.getArtista().equalsIgnoreCase(artistaInteresse)) {
            notificar = true;
        }

        if (generoInteresse != null && disco.getGenero().equalsIgnoreCase(generoInteresse)) {
            notificar = true;
        }

        if (notificar) {
            formaNotificacao.enviarNotificacao("Novo disco: " + disco.getTitulo() +
                    " | Artista: " + disco.getArtista() +
                    " | Gênero: " + disco.getGenero());
        }
    }
}
