package br.edu.ifpb.ads.padroes.atv1.repository;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.observer.Observer;
import br.edu.ifpb.ads.padroes.atv1.observer.Subject;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos implements Subject {
    private List<Disco> discos = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void registrarObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservers(Disco disco) {
        for (Observer o : observadores) {
            o.update(disco);
        }
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarObservers(disco);
    }

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream()
                .filter(d -> d.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream()
                .filter(d -> d.getArtista().toLowerCase().contains(artista.toLowerCase()))
                .toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream()
                .filter(d -> d.getGenero().toLowerCase().contains(genero.toLowerCase()))
                .toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream()
                .filter(d -> d.getAnoLancamento() == ano)
                .toList();
    }
}
