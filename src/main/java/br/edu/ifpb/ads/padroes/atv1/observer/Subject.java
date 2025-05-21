package br.edu.ifpb.ads.padroes.atv1.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject<T> {

    private final List<Observer<T>> observers = new LinkedList<>();

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(T data) {
        for(Observer<T> observer : observers) {
            observer.update(data);
        }
    }
}
