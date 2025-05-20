package refatoracao.observer;

import refatoracao.modelo.Disco;

public interface Observer {
    void atualizar(Disco disco);
}