package br.edu.ifpb.ads.padroes.atv1.Observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategyCanal;

public class ObservadorGenero implements ObservadorDisco{
    String genero;
    StrategyCanal strategy;

    public ObservadorGenero(String genero, StrategyCanal strategy) {
        this.genero = genero;
        this.strategy = strategy;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setStrategy(StrategyCanal strategy) {
        this.strategy = strategy;
    }

    @Override
    public void atualizar(Disco disco) {
        String generoDisco = disco.getGenero();
        if(generoDisco.contains(genero)){
            strategy.enviar("Novo disco do gênero: " + generoDisco);
        }
    }
}
