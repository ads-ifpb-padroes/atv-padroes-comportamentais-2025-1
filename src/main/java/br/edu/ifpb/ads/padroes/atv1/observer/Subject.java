package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.observer.Observer;
import br.edu.ifpb.ads.padroes.atv1.repository.Disco;

public interface Subject {
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers(Disco disco);
}

