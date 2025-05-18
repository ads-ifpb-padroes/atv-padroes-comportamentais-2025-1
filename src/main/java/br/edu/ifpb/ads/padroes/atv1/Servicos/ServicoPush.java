package br.edu.ifpb.ads.padroes.atv1.Servicos;

public class ServicoPush implements ServicoNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: "+ message);
    }

    @Override
    public String getServico() {
        return "PUSH NOTIFICATION";
    }
}
