package br.edu.ifpb.ads.padroes.atv1;

import java.util.LinkedList;
import java.util.List;

public class ObserverGenero implements Observer{
    private List<String> notificacoesGenero = new LinkedList<>();

    public void addNotificacaoGenero(String genero) {
        notificacoesGenero.add(genero);
    }

    @Override
    public void notificar(Disco disco, ServicoNotificacao servicoNotificacao, String canalNotificacao) {
        notificacoesGenero.stream().filter(d -> disco.getGenero().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao(canalNotificacao, "Novo disco do gênero: " + disco.getGenero());
        });
    }
}
