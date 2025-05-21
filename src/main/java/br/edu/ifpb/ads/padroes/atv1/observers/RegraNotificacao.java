package br.edu.ifpb.ads.padroes.atv1.observers;

import br.edu.ifpb.ads.padroes.atv1.Disco;

public interface RegraNotificacao {
    boolean deveNotificar(Disco disco);
    void notificar(Disco disco);
}
