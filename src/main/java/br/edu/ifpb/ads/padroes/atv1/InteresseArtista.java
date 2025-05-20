package br.edu.ifpb.ads.padroes.atv1;

public class InteresseArtista implements Interesse{

    private String artista;
    private ServicoNotificacao servicoNotificacao;

    public InteresseArtista(String artista,ServicoNotificacao servicoNotificacao){
        this.artista=artista;
        this.servicoNotificacao=servicoNotificacao;
    }

    public void notificar(Disco disco){
        if(disco.getArtista().equalsIgnoreCase(this.artista)){
            servicoNotificacao.enviarNotificacao("Novo disco do artista : " + disco.getArtista());
        }
    }
}