package br.edu.ifpb.ads.padroes.atv1.main;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifications.EmailNotificacao;
import br.edu.ifpb.ads.padroes.atv1.notifications.PushNotificacao;
import br.edu.ifpb.ads.padroes.atv1.notifications.SmsNotificacao;
import br.edu.ifpb.ads.padroes.atv1.observer.UserObserver;
import br.edu.ifpb.ads.padroes.atv1.repository.RepositorioDiscos;
import br.edu.ifpb.ads.padroes.atv1.interest.InteresseArtista;
import br.edu.ifpb.ads.padroes.atv1.interest.InteresseGenero;
import br.edu.ifpb.ads.padroes.atv1.interest.InteresseTitulo;

public class Main {
    public static void main(String[] args) {
        // Repositório
        RepositorioDiscos repositorio = new RepositorioDiscos();

        // Observadores
        UserObserver ana = new UserObserver("Ana", new EmailNotificacao());
        UserObserver joao = new UserObserver("João", new SmsNotificacao());
        UserObserver maria = new UserObserver("Manu", new PushNotificacao());

        // Interesses
        ana.adicionarInteresse(new InteresseTitulo("From Zero"));
        joao.adicionarInteresse(new InteresseArtista("Taylor Swift"));
        maria.adicionarInteresse(new InteresseGenero("Pop"));

        repositorio.registrarObserver(ana);
        repositorio.registrarObserver(joao);
        repositorio.registrarObserver(maria);

        // Discos
        Disco disco1 = new Disco("Linkin Park", "From Zero", "Rock", 2024);
        Disco disco2 = new Disco("Taylor Swift", "The Tortured Poets Department", "Pop", 2024);
        Disco disco3 = new Disco("Billie Eilish", "Hit Me Hard and Soft", "Pop", 2024);

        System.out.println("\nPublicando disco 1:");
        repositorio.addDisco(disco1);

        System.out.println("\nPublicando disco 2:");
        repositorio.addDisco(disco2);

        System.out.println("\nPublicando disco 3:");
        repositorio.addDisco(disco3);

        // Busca por título
        System.out.println("\nBusca por From Zero:");
        repositorio.buscarDiscos("From").forEach(System.out::println);

        // Busca por artista
        System.out.println("\nBusca por Taylor Swift:");
        repositorio.buscarDiscosPorArtista("Taylor Swift").forEach(System.out::println);

        // Busca por gênero
        System.out.println("\nBusca por gênero pop:");
        repositorio.buscarDiscosPorGenero("Pop").forEach(System.out::println);

        // Busca por ano
        System.out.println("\nBusca por 2024:");
        repositorio.buscarDiscosPorAno(2024).forEach(System.out::println);
    }
}
