package br.edu.ifpb.ads.padroes.atv1.observadores;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.CanalNotificacao;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observador;

public class ObservadorPorArtista implements Observador {
    private String artistaInteresse;
    private CanalNotificacao canal;

    public ObservadorPorArtista(String artistaInteresse, CanalNotificacao canal) {
        this.artistaInteresse = artistaInteresse;
        this.canal = canal;
    }

    public boolean temInteresse(Disco disco) {
        return disco.getArtista().equalsIgnoreCase(artistaInteresse);
    }

    public void notificar(Disco disco) {
        canal.enviar("Novo disco do artista de interesse: " + disco.getArtista());
    }
}
