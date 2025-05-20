package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canais.ServicoNotificacao;

import java.util.List;

public abstract class InteresseBase implements Interesse{

    protected String valor;
    protected List<ServicoNotificacao> servicos;

    public InteresseBase(String valor, List<ServicoNotificacao> servicos) {
        this.valor = valor;
        this.servicos = servicos;
    }

    @Override
    public void notificar(Disco disco) {
        String mensagem = gerarMensagem(disco);
        for (ServicoNotificacao servicoNotificacao: servicos) {
            servicoNotificacao.enviar(mensagem);
        }
    }

    protected abstract String gerarMensagem(Disco disco);

}
