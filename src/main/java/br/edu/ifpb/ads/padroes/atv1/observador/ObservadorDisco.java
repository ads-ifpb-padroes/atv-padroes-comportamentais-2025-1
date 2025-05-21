package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interessado;
import br.edu.ifpb.ads.padroes.atv1.notificacao.Notificador;

public class ObservadorDisco {
    private Interessado interesse;
    private Notificador notificador;

    public ObservadorDisco(Interessado interesse, Notificador notificador){
        this.interesse = interesse;
        this.notificador = notificador;
    }

    public Interessado getInteresse() {
        return interesse;
    }

    public Notificador getNotificador() {
        return notificador;
    }
}
