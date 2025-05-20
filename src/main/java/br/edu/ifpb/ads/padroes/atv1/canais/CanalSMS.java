package br.edu.ifpb.ads.padroes.atv1.canais;

public class CanalSMS implements ServicoNotificacao{

    private final String numero;

    public CanalSMS(String numero) {
        if (numero == null || !numero.matches("^(\\+55)?\\d{10,11}$")) {
            throw new IllegalArgumentException("Número informado é inválido: " + numero);
        }
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Para " + numero + ": "+ mensagem);
    }

}
