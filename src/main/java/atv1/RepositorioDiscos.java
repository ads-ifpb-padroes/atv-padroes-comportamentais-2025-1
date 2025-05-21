package atv1;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDiscos {
    private List<Disco> discos = new LinkedList<>();
    private List<Observer> interesses = new LinkedList<>();

    public void adicionarInteresse(Observer interesse) {
        interesses.add(interesse);
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarInteresses(disco);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    private void notificarInteresses(Disco disco) {
        for (Observer interesse : interesses) {
            if (interesse.corresponde(disco)) {
                interesse.notificar(disco);
            }
        }
    }

    // Métodos de busca continuam iguais (opcional refatorar depois)
}
