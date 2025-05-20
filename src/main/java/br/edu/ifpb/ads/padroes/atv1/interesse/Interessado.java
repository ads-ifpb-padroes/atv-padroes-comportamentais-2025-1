package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

public interface Interessado {
    boolean isInteressado(Disco disco);
    void  notificar(Disco disco);
}
