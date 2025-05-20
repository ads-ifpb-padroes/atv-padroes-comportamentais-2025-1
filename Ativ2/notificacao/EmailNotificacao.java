package refatoracao.notificacao;

public class EmailNotificacao implements CanalNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}