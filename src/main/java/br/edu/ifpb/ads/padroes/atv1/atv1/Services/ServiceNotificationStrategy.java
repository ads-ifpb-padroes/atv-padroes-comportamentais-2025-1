package br.edu.ifpb.ads.padroes.atv1.atv1.Services;


public interface ServiceNotificationStrategy {
    void enviarNotificacao(String message);
    String getServico();
}
