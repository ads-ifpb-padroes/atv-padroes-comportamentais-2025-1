package br.edu.ifpb.ads.padroes.atv1.observers;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

public class NotificacaoPorArtista implements RegraNotificacao {
    private String nomeArtista;
    private CanalNotificacao canal;

    public NotificacaoPorArtista(String nomeArtista, CanalNotificacao canal) {
        this.nomeArtista = nomeArtista;
        this.canal = canal;
    }

    @Override
    public boolean deveNotificar(Disco disco) {
        return disco.getTitulo().equalsIgnoreCase(nomeArtista);
    }

    @Override
    public void notificar(Disco disco) {
        canal.enviar("Novo disco do artista: " + disco.getArtista());
    }
}
