package br.edu.ifpb.ads.padroes.atv1.canais;

public class CanalPush implements ServicoNotificacao{

    private final String userId;

    public CanalPush(String userId) {
        if (userId == null || !userId.matches("^[\\w-]{5,}$")) {
            throw new IllegalArgumentException("ID de usuário inválido: " + userId);
        }
        this.userId = userId;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[PUSH] Para " + userId + ": " + mensagem);
    }

}
