package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interesse;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.ServicoNotificacoes;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<Interesse> interesses = new ArrayList<Interesse>();
    private String nome;
    private ServicoNotificacoes servicoNotificacoes;

    public void adicionarCanalNotificacao(ServicoNotificacoes servicoNotificacao) {
        this.servicoNotificacoes = servicoNotificacao;
    }

    public Observer(String nome) {
        this.nome = nome;
    }

    public List<Interesse> getInteresses() {
        return interesses;
    }

    public void addInteresse(Interesse interesse) {
        interesses.add(interesse);
    }
    public void removeInteresse(Interesse interesse) {
        interesses.add(interesse);
    }
    public void possuiInteresse(Disco disco) {
        for (Interesse interesse : interesses) {
            if (interesse.possuiInteresse(disco)) {
                this.servicoNotificacoes.enviarNotificacao("O usuário "+ this.nome +" possui interesse no disco " + disco.getTitulo());
            }
        }
    }
}
