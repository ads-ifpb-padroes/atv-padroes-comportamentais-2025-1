package br.edu.ifpb.ads.padroes.atv1.observadores;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.CanalNotificacao;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observador;

public class ObservadorPorTitulo implements Observador {
    private String tituloInteresse;
    private CanalNotificacao canal;

    public ObservadorPorTitulo(String tituloInteresse, CanalNotificacao canal) {
        this.tituloInteresse = tituloInteresse;
        this.canal = canal;
    }

    public boolean temInteresse(Disco disco) {
        return disco.getTitulo().equalsIgnoreCase(tituloInteresse);
    }

    public void notificar(Disco disco) {
        canal.enviar("Novo disco adicionado com título de interesse: " + disco.getTitulo());
    }
}
