package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.CanalNotificacao;

public class InteressadoPorGenero implements  Interessado{

    private String genero;
    private CanalNotificacao canal;

    public  InteressadoPorGenero(String genero, CanalNotificacao canal){
        this.genero = genero;
        this.canal = canal;
    }
    @Override
    public boolean isInteressado(Disco disco) {
        return disco.getGenero().equalsIgnoreCase(genero);
    }

    @Override
    public void notificar(Disco disco) {
        canal.enviarMensagem("Novo disco do genero: " + disco.getGenero());
    }
}
