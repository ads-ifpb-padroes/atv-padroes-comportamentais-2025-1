package br.edu.ifpb.ads.padroes.atv1.Observadores;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Servicos.ServicoNotificacaoStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificacoesArtista implements Observador {
    private List<String> artistas = new ArrayList<>();

    public void adicionarArtista(String artista) {
        artistas.add(artista);
    }

    public void removerArtista(String artista) {
        artistas.remove(artista);
    }

    @Override
    public void notificar(Disco disco, ServicoNotificacaoStrategy canal) {
        artistas.stream().filter(d -> disco.getGenero().contains(d)).forEach(d -> {
            canal.enviarNotificacao( "Novo disco do gênero: " + disco.getGenero());
        });
    }
}
