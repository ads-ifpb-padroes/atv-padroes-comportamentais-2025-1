package refatoracao.notificacao;

public class SmsNotificacao implements CanalNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}