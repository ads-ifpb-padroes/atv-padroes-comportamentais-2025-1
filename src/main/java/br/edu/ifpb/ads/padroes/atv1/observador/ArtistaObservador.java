package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canal.Canal;

public class ArtistaObservador extends InteressadoObservador{

    public ArtistaObservador(Canal canal) {
        super(canal);
    }

    @Override
    public void atualizar(Disco disco) {
        this.getCanal().enviarMensagem("Novo disco do artista: " + disco.getArtista());
    }
}
