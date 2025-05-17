package br.edu.ifpb.ads.padroes.atv1.Servicos;

public class ServicoSms implements ServicoNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    @Override
    public String getServico() {
        return "SMS";
    }
}
