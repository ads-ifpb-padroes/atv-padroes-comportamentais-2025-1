package br.edu.ifpb.ads.padroes.atv1.subjects;

import br.edu.ifpb.ads.padroes.atv1.observers.Observer;

public interface Subject<T> {
  void addObserver(Observer<T> observer);
  void removeObserver(Observer<T> observer);
  void notifyObservers();
}
