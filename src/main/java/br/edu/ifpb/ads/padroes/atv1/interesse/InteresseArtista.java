package br.edu.ifpb.ads.padroes.atv1.interesse;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.canais.ServicoNotificacao;

import java.util.List;

public class InteresseArtista extends InteresseBase {

    public InteresseArtista(String valor, List<ServicoNotificacao> servicos) {
        super(valor, servicos);
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getArtista().toLowerCase().contains(valor.toLowerCase());
    }

    @Override
    protected String gerarMensagem(Disco disco) {
        return String.format("Novo disco do artista " + valor + "adicionado\n", disco.getArtista());
    }

}
