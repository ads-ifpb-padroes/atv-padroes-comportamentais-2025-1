package br.edu.ifpb.ads.padroes.atv1;

public class InteresseGenero implements InteresseObserver{
    private String genero;
    private CanalNotificacaoStrategy canal;

    public InteresseGenero(String genero, CanalNotificacaoStrategy canal){
        this.genero=genero;
        this.canal=canal;
    }

    @Override
    public void atualiar(Disco disco) {
        canal.enviar("Novo genero adicionado. Genero: "+ disco.getGenero());
    }
}
