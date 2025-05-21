package br.edu.ifpb.ads.padroes.atv1;

public interface Observer {
    void notificar(Disco disco, ServicoNotificacao servicoNotificacao, String canalNotificacao);

}
