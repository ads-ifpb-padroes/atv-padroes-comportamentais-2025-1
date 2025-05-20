package br.edu.ifpb.ads.padroes.atv1.atv1.Observers;

import br.edu.ifpb.ads.padroes.atv1.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.atv1.Services.ServiceNotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoGenero implements Observer{
    private List<String> generos = new ArrayList<>();

    public void adicionarGenero(String genero) {
        generos.add(genero);
    }

    public void removerGenero(String genero) {
        generos.remove(genero);
    }

    @Override
    public void notificar(Disco disco, ServiceNotificationStrategy canal) {
        generos.stream().filter(d -> disco.getGenero().contains(d)).forEach(d -> {
            canal.enviarNotificacao("Novo disco do gênero: " + disco.getGenero());
        });
    }
}
