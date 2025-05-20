package refatoracao.repositorio;

import refatoracao.modelo.Disco;
import refatoracao.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDiscos {
    private List<Disco> discos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
        notificarObservers(disco);
    }

    private void notificarObservers(Disco disco) {
        for (Observer observer : observers) {
            observer.atualizar(disco);
        }
    }
}