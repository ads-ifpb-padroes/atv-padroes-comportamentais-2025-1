package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.CanalNotificacao;

public class InteressadoPorTitulo implements  Interessado{

    private  String titulo;
    private CanalNotificacao canal;

    public  InteressadoPorTitulo(String titulo, CanalNotificacao canal){
        this.titulo = titulo;
        this.canal = canal;
    }
    @Override
    public boolean isInteressado(Disco disco) {
        return disco.getTitulo().equalsIgnoreCase(titulo);
    }

    @Override
    public void notificar(Disco disco) {
        canal.enviarMensagem("Novo disco com o título: " + disco.getTitulo());
    }
}
