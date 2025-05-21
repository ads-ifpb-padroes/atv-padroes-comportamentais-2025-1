package br.edu.ifpb.ads.padroes.atv1.observers;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

public class NotificacaoPorDisco implements RegraNotificacao {
    private String tituloDisco;
    private CanalNotificacao canal;

    public NotificacaoPorDisco(String tituloDisco, CanalNotificacao canal) {
        this.tituloDisco = tituloDisco;
        this.canal = canal;
    }

    @Override
    public boolean deveNotificar(Disco disco) {
        return disco.getTitulo().equalsIgnoreCase(tituloDisco);
    }

    @Override
    public void notificar(Disco disco) {
        canal.enviar("Novo disco adiconado com título: " + disco.getTitulo());
    }
}
