package br.edu.ifpb.ads.padroes.atv1.refactor.Interesse;

import br.edu.ifpb.ads.padroes.atv1.refactor.Disco;
import br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao.CanalNotificacao;

public class Interessado {
    private CriterioInteresse criterioInteresse;
    private CanalNotificacao canalNotificacao;

    public Interessado(CriterioInteresse criterio, CanalNotificacao canal) {
        this.criterioInteresse = criterio;
        this.canalNotificacao = canal;
    }

    public void notificar(Disco disco) {
        if (criterioInteresse.corresponde(disco)) {
            canalNotificacao.enviarNotificacao("Novo disco do seu interesse: " + disco.getTitulo());
        }
    }

    public CriterioInteresse getCriterioInteresse() {
        return criterioInteresse;
    }

    public void setCriterioInteresse(CriterioInteresse criterioInteresse) {
        this.criterioInteresse = criterioInteresse;
    }

    public CanalNotificacao getCanalNotificacao() {
        return canalNotificacao;
    }

    public void setCanalNotificacao(CanalNotificacao canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }
}
