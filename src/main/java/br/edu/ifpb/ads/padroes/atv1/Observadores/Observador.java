package br.edu.ifpb.ads.padroes.atv1.Observadores;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Servicos.ServicoNotificacaoStrategy;

public interface Observador {
    void notificar(Disco disco, ServicoNotificacaoStrategy canal);
}
