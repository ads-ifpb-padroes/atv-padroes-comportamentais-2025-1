package refatoracao.observer;

import refatoracao.modelo.Disco;
import refatoracao.notificacao.CanalNotificacao;

import java.util.List;

public class ObserverArtista implements Observer {
    private List<String> artistasInteresse;
    private CanalNotificacao canal;

    public ObserverArtista(List<String> artistasInteresse, CanalNotificacao canal) {
        this.artistasInteresse = artistasInteresse;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (artistasInteresse.contains(disco.getArtista())) {
            canal.notificar("Novo disco de artista de interesse: " + disco.getArtista());
        }
    }
}