package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interesse;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.NotificacaoSMS;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.ServicoNotificacoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioDiscos {
    private List<Observer> observers = new ArrayList<>();
    private ServicoNotificacoes notificacao;

    private List<Disco> discos = new LinkedList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notificar(Disco disco) {
        for (Observer observer : observers) {
            observer.possuiInteresse(disco);
        }
    }
    public void adicionarDisco(Disco disco) {
        discos.add(disco);
        notificar(disco);
    }
}


