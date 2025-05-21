package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.CanalNotificacao;

public class InteressadoPorArtista implements  Interessado{

    private String artista;
    private CanalNotificacao canal;

    public InteressadoPorArtista(String artista, CanalNotificacao canal){
        this.artista = artista;
        this.canal = canal;
    }

    @Override
    public void notificar(Disco disco) {
        if (disco.getArtista().equalsIgnoreCase(artista)){
            canal.enviarMensagem("Novo disco do Artista: " + disco.getArtista());
        }

    }
}
