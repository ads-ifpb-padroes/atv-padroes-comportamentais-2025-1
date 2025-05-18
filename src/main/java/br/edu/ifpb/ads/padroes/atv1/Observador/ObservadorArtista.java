package br.edu.ifpb.ads.padroes.atv1.Observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategyCanal;

public class ObservadorArtista implements ObservadorDisco{
    String nomeArtista;
    StrategyCanal strategy;

    public ObservadorArtista(String nomeArtista, StrategyCanal strategy) {
        this.nomeArtista = nomeArtista;
        this.strategy = strategy;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setStrategy(StrategyCanal strategy) {
        this.strategy = strategy;
    }

    @Override
    public void atualizar(Disco disco) {
        String artistaDisco = disco.getArtista();
        if(artistaDisco.contains(nomeArtista)){
            strategy.enviar("Novo disco adicionado de: " + artistaDisco);
        }
    }
}
