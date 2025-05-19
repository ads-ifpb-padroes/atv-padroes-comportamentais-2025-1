package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.Observador.ObservadorArtista;
import br.edu.ifpb.ads.padroes.atv1.Observador.ObservadorDisco;
import br.edu.ifpb.ads.padroes.atv1.Observador.ObservadorGenero;
import br.edu.ifpb.ads.padroes.atv1.Observador.ObservadorTitulo;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategyEmail;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategyPush;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategySMS;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorioDiscos = new RepositorioDiscos();

        Disco disco1 = new Disco("Chuck Berry", "Jhonny B. Goode", "Rock and Roll", 1958);
        Disco disco2 = new Disco("Huey Lewis and the News", "The Power of Love", "Pop Rock", 1985);
        Disco disco3 = new Disco("Rondò Veneziano", "La Serenissima", "Barroco", 1981);

        ObservadorDisco artista = new ObservadorArtista("Chuck", new StrategyEmail());
        ObservadorDisco genero = new ObservadorGenero("Rock", new StrategyPush());
        ObservadorDisco genero2 = new ObservadorGenero("Pop", new StrategyEmail());
        ObservadorDisco titulo = new ObservadorTitulo("Serenissima", new StrategySMS());

        //Primeiro notificacao e disco
        repositorioDiscos.addNotificacao(artista);
        repositorioDiscos.addDisco(disco1);

        //Demais notificacoes
        repositorioDiscos.addNotificacao(genero);
        repositorioDiscos.addNotificacao(genero2);
        repositorioDiscos.addNotificacao(titulo);

        //Demais discos
        repositorioDiscos.addDisco(disco2);
        repositorioDiscos.addDisco(disco3);
    }
}
