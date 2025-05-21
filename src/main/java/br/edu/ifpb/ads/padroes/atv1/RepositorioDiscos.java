package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.observador.Interesse;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDiscos {

    private final List<Disco> discos = new LinkedList<>();
    private final List<Interesse> interesses = new LinkedList<>();

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarInteresses(disco);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase().contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase().contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase().contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    public void registrarInteresse(Interesse interesse) {
        interesses.add(interesse);
    }

    private void notificarInteresses(Disco disco) {
        for (Interesse interesse : interesses) {
            if (interesse.deveNotificar(disco)) {
                interesse.notificar(disco);
            }
        }
    }
}
