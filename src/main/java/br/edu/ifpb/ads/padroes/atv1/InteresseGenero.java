package br.edu.ifpb.ads.padroes.atv1;

public class InteresseGenero implements Interesse{

    private String genero;
    private ServicoNotificacao servicoNotificacao;

    public InteresseGenero(String artista,ServicoNotificacao servicoNotificacao){
        this.genero=genero;
        this.servicoNotificacao=servicoNotificacao;
    }

    public void notificar(Disco disco){
        if(disco.getGenero().equalsIgnoreCase(this.genero)){
            servicoNotificacao.enviarNotificacao("Novo disco do genero: " + disco.getGenero());
        }
    }
}