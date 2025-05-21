package br.edu.ifpb.ads.padroes.atv1;

/**
 * Classe responsável por enviar notificações.
 */
public class ServicoNotificacao {
    private CanalNotificacaoStrategy canal;

    public void setCanal(CanalNotificacaoStrategy canal){
        this.canal=canal;
    }

    public void enviarNotificacao(String message){
        canal.enviar(message);
    }

}
