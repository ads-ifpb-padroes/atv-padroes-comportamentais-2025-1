package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.canal.Canal;
import br.edu.ifpb.ads.padroes.atv1.canal.EmailCanal;
import br.edu.ifpb.ads.padroes.atv1.observador.ArtistaObservador;
import br.edu.ifpb.ads.padroes.atv1.observador.InteressadoObservador;

public class Loader {
    public static void main(String[] args) {
        Disco disco = new Disco("Manoel Gomes", "Caneta blue", "Funk", 2025);
        Canal email = new EmailCanal();
        InteressadoObservador observadorArtista = new ArtistaObservador(email);
        RepositorioDiscos respositorio = new RepositorioDiscos();
        respositorio.addObservador(observadorArtista);
        respositorio.addDisco(disco);

    }
}
