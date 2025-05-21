package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificadorEmail;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificadorSMS;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificadorPush;
import br.edu.ifpb.ads.padroes.atv1.observador.Interesse;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        repositorio.registrarInteresse(new Interesse(
                disco -> disco.getGenero().toLowerCase().contains("pop"),
                new NotificadorEmail()));

        repositorio.registrarInteresse(new Interesse(
                disco -> disco.getArtista().equalsIgnoreCase("Legião Urbana"),
                new NotificadorSMS()));

        repositorio.registrarInteresse(new Interesse(
                disco -> disco.getGenero().equalsIgnoreCase("MPB"),
                new NotificadorPush()));

        Disco d1 = new Disco("Legião Urbana", "As Quatro Estações", "Rock", 1989);
        Disco d2 = new Disco("Chico Buarque", "Construção", "MPB", 1971);
        Disco d3 = new Disco("Michael Jackson", "Thriller", "Pop", 1982);
        repositorio.addDisco(d1);
        repositorio.addDisco(d2);
        repositorio.addDisco(d3);
    }
}
