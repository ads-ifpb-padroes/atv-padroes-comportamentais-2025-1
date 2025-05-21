package br.edu.ifpb.ads.padroes.atv1.refactor;

import br.edu.ifpb.ads.padroes.atv1.refactor.Interesse.*;
import br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao.CanalNotificacao;
import br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao.Email;
import br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao.SMS;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        CanalNotificacao email = new Email();
        CanalNotificacao whatsapp = new SMS();

        CriterioInteresse interesseRock = new InteressePorGenero("Rock");
        CriterioInteresse interesseBeatles = new InteressePorArtista("The Beatles");
        CriterioInteresse interesseTitulo = new InteressePorDisco("Dark Side");

        Interessado interessado1 = new Interessado(interesseRock, whatsapp);
        Interessado interessado2 = new Interessado(interesseBeatles, email);
        Interessado interessado3 = new Interessado(interesseTitulo, email);

        repositorio.addInteressado(interessado1);
        repositorio.addInteressado(interessado2);
        repositorio.addInteressado(interessado3);

        Disco disco1 = new Disco("Dark Side of the Moon", "Pink Floyd", "Rock", 1973);
        Disco disco2 = new Disco("Abbey Road", "The Beatles", "Rock", 1969);
        Disco disco3 = new Disco("Thriller", "Michael Jackson", "Pop", 1982);

        repositorio.addDisco(disco1);
        repositorio.addDisco(disco2);
        repositorio.addDisco(disco3);
    }
}
