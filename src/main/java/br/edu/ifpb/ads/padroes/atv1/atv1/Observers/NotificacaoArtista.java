package br.edu.ifpb.ads.padroes.atv1.atv1.Observers;

import br.edu.ifpb.ads.padroes.atv1.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.atv1.Services.ServiceNotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoArtista implements Observer{
    private List<String> artistas = new ArrayList<>();

    public void adicionarArtista(String artista) {
        artistas.add(artista);
    }

    public void removerArtista(String artista) {
        artistas.remove(artista);
    }

    @Override
    public void notificar(Disco disco, ServiceNotificationStrategy canal) {
        artistas.stream().filter(d -> disco.getGenero().contains(d)).forEach(d -> {
            canal.enviarNotificacao( "Novo disco do gênero: " + disco.getGenero());
        });
    }
}
