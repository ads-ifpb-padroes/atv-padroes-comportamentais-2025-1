package atv1;

public class NotificarPorSMS implements Notificacao {
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}