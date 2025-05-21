package br.edu.ifpb.ads.padroes.atv1;

public class InteresseTitulo implements  InteresseObserver{

    private String titulo;
    private CanalNotificacaoStrategy canal;

    public InteresseTitulo(String titulo, CanalNotificacaoStrategy canal){
        this.titulo=titulo;
        this.canal=canal;
    }

    @Override
    public void atualiar(Disco disco) {
        canal.enviar("Novo disco adicionado. Titulo: "+ disco.getTitulo());
    }
}
