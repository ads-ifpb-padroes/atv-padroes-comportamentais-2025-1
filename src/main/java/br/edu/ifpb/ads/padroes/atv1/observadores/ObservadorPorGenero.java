package br.edu.ifpb.ads.padroes.atv1.observadores;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.CanalNotificacao;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observador;

public class ObservadorPorGenero implements Observador {
    private String generoInteresse;
    private CanalNotificacao canal;

    public ObservadorPorGenero(String generoInteresse, CanalNotificacao canal) {
        this.generoInteresse = generoInteresse;
        this.canal = canal;
    }

    public boolean temInteresse(Disco disco) {
        return disco.getGenero().equalsIgnoreCase(generoInteresse);
    }

    public void notificar(Disco disco) {
        canal.enviar("Novo disco do gênero de interesse: " + disco.getGenero());
    }
}
