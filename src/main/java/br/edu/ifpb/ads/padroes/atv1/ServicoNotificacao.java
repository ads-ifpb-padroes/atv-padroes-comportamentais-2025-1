package br.edu.ifpb.ads.padroes.atv1;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável por enviar notificações.
 */
public class ServicoNotificacao {
    private final Map<String, NotificacaoStrategy> estrategias = new HashMap<>();


    public ServicoNotificacao() {
        estrategias.put("email", new EmailNotificacao());
        estrategias.put("sms", new SmsNotificacao());
        estrategias.put("push", new PushNotificacao());
    }

    public void addFormaNotificacao(String forma, NotificacaoStrategy notificador){
        estrategias.put(forma, notificador);
    }

    public void enviarNotificacao(String canal, String message) {
       estrategias.get(canal).enviar(message);
    }

}
