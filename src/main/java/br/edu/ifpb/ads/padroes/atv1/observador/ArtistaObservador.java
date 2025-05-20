package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canal.Canal;

public class ArtistaObservador implements InteressadoObservador{
    private final Canal canal;

    public ArtistaObservador(Canal canal) {
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        this.getCanal().enviarMensagem("Novo disco do artista: " + disco.getArtista());
    }

    public Canal getCanal() {
        return canal;
    }
}
