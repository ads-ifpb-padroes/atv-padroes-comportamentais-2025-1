package atv1;

public class NotificarPorPush implements Notificacao {
    public void notificar(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}