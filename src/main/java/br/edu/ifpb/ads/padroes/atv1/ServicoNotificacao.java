package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.Observadores.Observador;
import br.edu.ifpb.ads.padroes.atv1.Servicos.ServicoNotificacaoStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por enviar notificações.
 */

public class ServicoNotificacao {

    private List<Observador> observadors = new ArrayList<>();
    private ServicoNotificacaoStrategy canalNotificacao;

    public void adicionarObservadores(Observador O) {
        observadors.add(O);
    }
    public void removerObservador(Observador O) {
        observadors.remove(O);
    }
    public void setCanalNotificacao(ServicoNotificacaoStrategy canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public void enviarNotificacao(Disco disco) {
        if(canalNotificacao != null) {
            for (Observador O : observadors) {
                O.notificar(disco, canalNotificacao);
            }
        }
        else {
            System.out.println("Nenhum canal definido!");
        }

    }

}
