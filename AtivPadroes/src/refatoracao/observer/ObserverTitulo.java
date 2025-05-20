package refatoracao.observer;

import refatoracao.modelo.Disco;
import refatoracao.notificacao.CanalNotificacao;

import java.util.List;

public class ObserverTitulo implements Observer {
    private List<String> titulosInteresse;
    private CanalNotificacao canal;

    public ObserverTitulo(List<String> titulosInteresse, CanalNotificacao canal) {
        this.titulosInteresse = titulosInteresse;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (titulosInteresse.contains(disco.getTitulo())) {
            canal.notificar("Novo disco com título de interesse: " + disco.getTitulo());
        }
    }
}