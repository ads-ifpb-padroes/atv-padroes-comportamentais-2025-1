package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.repository.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

import java.util.ArrayList;
import java.util.List;

public class UserObserver implements Observer {
    private String nome;
    private CanalNotificacao canal;

    private List<String> interessesTitulo = new ArrayList<>();
    private List<String> interessesArtista = new ArrayList<>();
    private List<String> interessesGenero = new ArrayList<>();

    public UserObserver(String nome, CanalNotificacao canal) {
        this.nome = nome;
        this.canal = canal;
    }

    public void adicionarInteresseTitulo(String titulo) {
        interessesTitulo.add(titulo);
    }

    public void adicionarInteresseArtista(String artista) {
        interessesArtista.add(artista);
    }

    public void adicionarInteresseGenero(String genero) {
        interessesGenero.add(genero);
    }

    @Override
    public void update(Disco disco) {
        if (interessesTitulo.stream().anyMatch(disco.getTitulo()::contains) || interessesArtista.stream().anyMatch(disco.getArtista()::contains) || interessesGenero.stream().anyMatch(disco.getGenero()::contains)) {

            String mensagem = nome + ", novo disco adicionado: " + disco.getTitulo() + " - " + disco.getArtista() + " (" + disco.getGenero() + ")";
            canal.enviar(mensagem);
        }
    }
}
