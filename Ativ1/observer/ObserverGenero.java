package refatoracao.observer;

import refatoracao.modelo.Disco;
import refatoracao.notificacao.CanalNotificacao;

import java.util.List;

public class ObserverGenero implements Observer {
    private List<String> generosInteresse;
    private CanalNotificacao canal;

    public ObserverGenero(List<String> generosInteresse, CanalNotificacao canal) {
        this.generosInteresse = generosInteresse;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (generosInteresse.contains(disco.getGenero())) {
            canal.notificar("Novo disco do gênero de interesse: " + disco.getGenero());
        }
    }
}