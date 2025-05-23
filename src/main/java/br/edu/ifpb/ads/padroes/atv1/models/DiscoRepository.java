package br.edu.ifpb.ads.padroes.atv1.models;

import java.util.LinkedList;
import java.util.List;

import br.edu.ifpb.ads.padroes.atv1.observers.Observer;
import br.edu.ifpb.ads.padroes.atv1.subjects.Subject;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class DiscoRepository implements Subject<Disco> {

  private List<Disco> discos = new LinkedList<>();
  private Disco notifiableDisco;
  private List<Observer<Disco>> observers = new LinkedList<>();

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

  public void addDisco(Disco disco) {
    discos.add(disco);
    notify(disco);
  }

  public void removeDisco(Disco disco) {
    discos.remove(disco);
  }

  public void setNotifiableDisco(Disco disco) {
    if (discos.contains(disco)) {
      this.notifiableDisco = disco;
    }
  }

  @Override
  public void addObserver(Observer<Disco> observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer<Disco> observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    if (notifiableDisco == null)
      return;

    for (Observer<Disco> observer : observers) {
      observer.update(notifiableDisco);
    }
  }

  // --------------------------- helpers

  private void notify(Disco disco) {
    setNotifiableDisco(disco);
    notifyObservers();
    setNotifiableDisco(null);
  }
}
