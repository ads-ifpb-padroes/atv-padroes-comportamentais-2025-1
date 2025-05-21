package br.edu.ifpb.ads.padroes.atv1.interfaces;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public interface Observador {
    boolean temInteresse(Disco disco);
    void notificar(Disco disco);
}
