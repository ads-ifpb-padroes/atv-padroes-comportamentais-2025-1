package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notification.CanalNotificacao;

public class NotificacaoPorGenero implements RegraNotificacao {
    private String tituloGenero;
    private CanalNotificacao canal;

    public NotificacaoPorGenero(String tituloGenero, CanalNotificacao canal) {
        this.tituloGenero = tituloGenero;
        this.canal = canal;
    }

    @Override
    public boolean deveNotificar(Disco disco) {
        return disco.getGenero().equalsIgnoreCase(tituloGenero);
    }

    @Override
    public void notificar(Disco disco) {
        canal.enviar("Novo disco com o gênero: " + disco.getTitulo());
    }
}
