package br.edu.ifpb.ads.padroes.atv1;

public class InteresseArtista implements InteresseObserver{

    private String nomeArtista;
    private  CanalNotificacaoStrategy canal;

    public InteresseArtista(String nomeArtista, CanalNotificacaoStrategy canal){
        this.nomeArtista=nomeArtista;
        this.canal=canal;
    }

    @Override
    public void atualiar(Disco disco) {
       canal.enviar("Artista adicionado. Nome :"+ disco.getArtista());
    }
}
