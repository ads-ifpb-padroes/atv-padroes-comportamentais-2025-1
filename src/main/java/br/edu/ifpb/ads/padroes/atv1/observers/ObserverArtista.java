package br.edu.ifpb.ads.padroes.atv1.observers;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.ServicoNotificacao;

import java.util.LinkedList;
import java.util.List;

public class ObserverArtista implements Observer {
    private List<String> notificacoesArtista = new LinkedList<>();

    public void addNotificacaoArtista(String artista) {
        notificacoesArtista.add(artista);
    }

    @Override
    public void notificar(Disco disco, ServicoNotificacao servicoNotificacao, String canalNotificacao) {
        notificacoesArtista.stream().filter(d -> disco.getArtista().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao(canalNotificacao, "Novo disco do artista: " + disco.getArtista());
        });
    }

}
