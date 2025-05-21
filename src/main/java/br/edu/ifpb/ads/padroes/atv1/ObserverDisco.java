package br.edu.ifpb.ads.padroes.atv1;

import java.util.LinkedList;
import java.util.List;

public class ObserverDisco implements Observer {
    private List<String> notificacoesDisco = new LinkedList<>();

    public void addNotificacaoDisco(String disco) {
        notificacoesDisco.add(disco);
    }

    @Override
    public void notificar(Disco disco, ServicoNotificacao servicoNotificacao, String canalNotificacao) {
        notificacoesDisco.stream().filter(d -> disco.getTitulo().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao(canalNotificacao, "Novo disco adicionado: " + disco.getTitulo());
        });
    }
}
