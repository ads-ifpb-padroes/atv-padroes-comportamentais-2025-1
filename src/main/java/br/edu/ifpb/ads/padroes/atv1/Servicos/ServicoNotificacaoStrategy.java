package br.edu.ifpb.ads.padroes.atv1.Servicos;

public interface ServicoNotificacaoStrategy {
    void enviarNotificacao(String message);
    String getServico();
}
