package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoArtista;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoGenero;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoTitulo;
import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoEmail;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoPush;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoSMS;
import br.edu.ifpb.ads.padroes.atv1.observador.ObservadorDisco;
import br.edu.ifpb.ads.padroes.atv1.repositorio.RepositorioDiscos;

public class Main {
    public static void main(String[] args) {
        // Cria o repositório
        RepositorioDiscos repositorio = new RepositorioDiscos();

        // Cria observadores/interessados
        repositorio.adicionarObservador(new ObservadorDisco(
                new InteressadoTitulo("A Night at the Opera"),
                new NotificacaoEmail()));

        repositorio.adicionarObservador(new ObservadorDisco(
                new InteressadoGenero("Rock"),
                new NotificacaoPush()));

        repositorio.adicionarObservador(new ObservadorDisco(
                new InteressadoArtista("Radiohead"),
                new NotificacaoSMS()));


        // Cria e adiciona um disco
        Disco novoDisco = new Disco("Radiohead", "OK Computer", "Rock", 1997);
        repositorio.addDisco(novoDisco);
        Disco novoDisco1 = new Disco("Queen", "A Night at the Opera", "Rock", 1975);
        repositorio.addDisco(novoDisco1);
    }
}
