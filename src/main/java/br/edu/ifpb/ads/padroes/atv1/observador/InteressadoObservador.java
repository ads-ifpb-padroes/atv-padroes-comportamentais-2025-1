package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canal.Canal;

public abstract class InteressadoObservador {
    private Canal canal;

    public InteressadoObservador(Canal canal) {
        this.canal = canal;
    }

    public abstract void atualizar(Disco disco);

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
