package br.edu.ifpb.ads.padroes.atv1.canais;

public class CanalEmail implements ServicoNotificacao {

    private final String email;

    public CanalEmail(String email) {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Para " + email + ": " + mensagem);
    }
}
