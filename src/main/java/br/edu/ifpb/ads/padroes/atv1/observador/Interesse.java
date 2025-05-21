package br.edu.ifpb.ads.padroes.atv1.observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.Notificador;

import java.util.function.Predicate;

public class Interesse {

    private final Predicate<Disco> criterio;
    private final Notificador notificador;

    public Interesse(Predicate<Disco> criterio, Notificador notificador) {
        this.criterio = criterio;
        this.notificador = notificador;
    }

    public boolean deveNotificar(Disco disco) {
        return criterio.test(disco);
    }

    public void notificar(Disco disco) {
        notificador.notificar("Novo disco adicionado: " + disco.getTitulo()
                + " - Artista: " + disco.getArtista()
                + " - Gênero: " + disco.getGenero()
                + " - Ano: " + disco.getAnoLancamento());
    }
}
