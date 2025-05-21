package br.edu.ifpb.ads.padroes.atv1.observers;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.ServicoNotificacao;

public interface Observer {
    void notificar(Disco disco, ServicoNotificacao servicoNotificacao, String canalNotificacao);

}
