package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.interest.Interesse;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

import java.util.ArrayList;
import java.util.List;

public class UserObserver implements Observer {
    private String nome;
    private CanalNotificacao canal;
    private List<Interesse> interesses = new ArrayList<>();

    public UserObserver(String nome, CanalNotificacao canal) {
        this.nome = nome;
        this.canal = canal;
    }

    public void adicionarInteresse(Interesse interesse) {
        interesses.add(interesse);
    }

    @Override
    public void update(Disco disco) {
        boolean temInteresse = interesses.stream().anyMatch(i -> i.PossuiInteresse(disco));

        if (temInteresse) {
            String mensagem = nome + ", novo disco adicionado: " + disco.getTitulo() + " - " + disco.getArtista() + " (" + disco.getGenero() + ")";
            canal.enviar(mensagem);
        }
    }
}
