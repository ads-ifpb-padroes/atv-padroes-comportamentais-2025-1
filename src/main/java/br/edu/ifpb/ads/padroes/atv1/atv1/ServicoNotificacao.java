package br.edu.ifpb.ads.padroes.atv1.atv1;

/**
 * Classe responsável por enviar notificações.
 */

import br.edu.ifpb.ads.padroes.atv1.atv1.Observers.Observer;
import br.edu.ifpb.ads.padroes.atv1.atv1.Services.ServiceNotificationStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ServicoNotificacao {

    private List<Observer> observadores = new ArrayList<>();
    private ServiceNotificationStrategy canalNotificacao;

    public void adicionarObservadores(Observer O) {
        observadores.add(O);
    }
    public void removerObservador(Observer O) {
        observadores.remove(O);
    }
    public void setCanalNotificacao(ServiceNotificationStrategy canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public void enviarNotificacao(Disco disco) {
        if(canalNotificacao != null) {
            for (Observer O : observadores) {
                O.notificar(disco, canalNotificacao);
            }
        }
        else {
            System.out.println("Nenhum canal definido!");
        }

    }

}
