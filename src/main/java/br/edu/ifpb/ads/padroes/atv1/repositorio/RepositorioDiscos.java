package br.edu.ifpb.ads.padroes.atv1.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.ads.padroes.atv1.interfaces.Observador;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class RepositorioDiscos {

    private List<Disco> discos = new ArrayList<>();
    private List<Observador> observadores = new ArrayList<>();

    public void addObservador(Observador observador) {
        observadores.add(observador);
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarInteressados(disco);
    }

    private void notificarInteressados(Disco disco) {
        for (Observador obs : observadores) {
            if (obs.temInteresse(disco)) {
                obs.notificar(disco);
            }
        }
    }

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }
    // métodos de busca e remoção continuam como estão
}
