package br.edu.ifpb.ads.padroes.atv1.notificacoes;

import java.sql.SQLOutput;

public class NotificacaoSMS implements ServicoNotificacoes {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Notificação via SMS: " + message);
    }
}
