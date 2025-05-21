package br.edu.ifpb.ads.padroes.atv1.repositorio;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interessado;

public interface SubjectRepositorioDiscos {
    void add(Interessado interessado);
    void remove(Interessado interessado);
    void notificacao();
}
