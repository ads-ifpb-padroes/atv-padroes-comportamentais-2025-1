package refatoracao;

import refatoracao.modelo.Disco;
import refatoracao.notificacao.EmailNotificacao;
import refatoracao.notificacao.SmsNotificacao;
import refatoracao.observer.ObserverArtista;
import refatoracao.observer.ObserverGenero;
import refatoracao.observer.ObserverTitulo;
import refatoracao.repositorio.RepositorioDiscos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        var email = new EmailNotificacao();
        var sms = new SmsNotificacao();

        var obsTitulo = new ObserverTitulo(List.of("In Rainbows", "The Wall"), email);
        var obsArtista = new ObserverArtista(List.of("Radiohead", "Pink Floyd"), sms);
        var obsGenero = new ObserverGenero(List.of("Rock", "Jazz"), email);

        repositorio.adicionarObserver(obsTitulo);
        repositorio.adicionarObserver(obsArtista);
        repositorio.adicionarObserver(obsGenero);

        Disco disco1 = new Disco("Radiohead", "In Rainbows", "Rock", 2007);
        Disco disco2 = new Disco("Chico Buarque", "Construção", "MPB", 1971);

        repositorio.adicionarDisco(disco1);
        repositorio.adicionarDisco(disco2);
    }
}