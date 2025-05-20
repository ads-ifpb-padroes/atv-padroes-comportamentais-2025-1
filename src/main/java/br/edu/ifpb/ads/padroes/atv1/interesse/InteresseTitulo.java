package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canais.ServicoNotificacao;

import java.util.List;

public class InteresseTitulo extends InteresseBase {

    public InteresseTitulo(String valor, List<ServicoNotificacao> servicos) {
        super(valor, servicos);
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getTitulo().toLowerCase().contains(valor.toLowerCase());
    }

    @Override
    protected String gerarMensagem(Disco disco) {
        return String.format("Novo disco adicionado: %s\n", disco.getArtista());
    }

}
