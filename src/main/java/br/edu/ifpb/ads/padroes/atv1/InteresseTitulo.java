package br.edu.ifpb.ads.padroes.atv1;

public class InteresseTitulo implements Interesse{
    private String titulo;
    private ServicoNotificacao servicoNotificacao;

    public InteresseTitulo(String titulo,ServicoNotificacao servicoNotificacao){
        this.titulo=titulo;
        this.servicoNotificacao=servicoNotificacao;
    }

    public void notificar(Disco disco){
        if(disco.getTitulo().equalsIgnoreCase(this.titulo)){
            servicoNotificacao.enviarNotificacao("Novo disco adicionado: " + disco.getTitulo());
        }
    }
}