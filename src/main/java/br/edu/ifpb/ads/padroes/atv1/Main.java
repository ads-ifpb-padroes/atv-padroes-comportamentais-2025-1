package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoPorArtista;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoPorGenero;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteressadoPorTitulo;
import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoPorEmail;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoPorPush;
import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoPorSMS;
import br.edu.ifpb.ads.padroes.atv1.repositorio.RepositorioDiscos;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repositorioDiscos = new RepositorioDiscos();

        repositorioDiscos.add(new InteressadoPorArtista("Elis Regina",  new NotificacaoPorSMS()));
        repositorioDiscos.add(new InteressadoPorArtista("Elis Regina",  new NotificacaoPorEmail()));
        repositorioDiscos.add(new InteressadoPorGenero("Forro", new NotificacaoPorPush()));
        repositorioDiscos.add(new InteressadoPorTitulo("Clube da Esquina", new NotificacaoPorEmail()));

        repositorioDiscos.addDisco(new Disco("Milton Nascimento", "Clube da Esquina", "MPB", 1972));
        repositorioDiscos.addDisco(new Disco("Elis Regina", "Falso Brilhante", "MPB", 1976));
        repositorioDiscos.addDisco(new Disco("Chico Buarque", "Construção", "MPB", 1971));
        repositorioDiscos.addDisco(new Disco("Legião Urbana", "Dois", "Rock", 1986));
        repositorioDiscos.addDisco(new Disco("Dominguinhos", "Gostoso Demais", "Forro", 1980));


    }
}
