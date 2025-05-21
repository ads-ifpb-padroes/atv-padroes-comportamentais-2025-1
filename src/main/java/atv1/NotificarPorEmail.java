package atv1;

public class NotificarPorEmail implements Notificacao {
    public void notificar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}