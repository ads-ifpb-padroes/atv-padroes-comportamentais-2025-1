package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;

public interface Interesse {

    boolean corresponde(Disco disco);
    void notificar(Disco disco);

}
