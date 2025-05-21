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
    public void notificar(Disco disco) {
        if (disco.getGenero().equalsIgnoreCase(genero)){
            canal.enviarMensagem("Novo disco do Artista: " + disco.getGenero());
        }
    }
}
