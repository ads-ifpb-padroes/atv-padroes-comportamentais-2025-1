package br.edu.ifpb.ads.padroes.atv1.Observador;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.Strategy.StrategyCanal;

import java.util.Objects;

public class ObservadorTitulo implements ObservadorDisco {
    String titulo;
    StrategyCanal strategy;

    public ObservadorTitulo(String titulo, StrategyCanal strategy) {
        this.titulo = titulo;
        this.strategy = strategy;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setStrategy(StrategyCanal strategy) {
        this.strategy = strategy;
    }

    @Override
    public void atualizar(Disco disco) {
        String tituloDisco = disco.getTitulo();
        if(tituloDisco.contains(titulo)){
            strategy.enviar("Novo disco adicionado: " + tituloDisco);
        }
    }
}
