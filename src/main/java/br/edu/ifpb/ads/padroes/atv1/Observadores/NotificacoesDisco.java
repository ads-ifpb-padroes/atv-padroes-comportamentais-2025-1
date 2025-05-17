package br.edu.ifpb.ads.padroes.atv1.Observadores;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Servicos.ServicoNotificacaoStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificacoesDisco implements Observador{
    private List<String> discos = new ArrayList<>();

    public void adicionarDisco(String disco) {
        discos.add(disco);
    }

    public void removerDisco(String disco) {
        discos.remove(disco);
    }

    @Override
    public void notificar(Disco disco, ServicoNotificacaoStrategy canal) {
        discos.stream().filter(d -> disco.getTitulo().contains(d)).forEach(d -> {
            canal.enviarNotificacao( "Novo disco adicionado: " + disco.getTitulo());
        });
    }
}
