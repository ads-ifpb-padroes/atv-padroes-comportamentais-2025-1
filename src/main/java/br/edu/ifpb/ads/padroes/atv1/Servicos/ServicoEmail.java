package br.edu.ifpb.ads.padroes.atv1.Servicos;

public class ServicoEmail implements ServicoNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando email: "+ message);
    }

    @Override
    public String getServico() {
        return "Email";
    }

}
