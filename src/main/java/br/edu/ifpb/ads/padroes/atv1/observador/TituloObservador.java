package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canal.Canal;

public class TituloObservador implements InteressadoObservador{
    private Canal canal;

    public TituloObservador(Canal canal) {
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        this.getCanal().enviarMensagem("Novo disco adicionado: " + disco.getTitulo());
    }

    public Canal getCanal() {
        return canal;
    }
}
