package br.edu.ifpb.ads.padroes.atv1.repositorio;

import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;
import br.edu.ifpb.ads.padroes.atv1.observador.ObservadorDisco;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    private List<ObservadorDisco> observadorDiscoList = new LinkedList<>();

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarObservadores(disco);
    }

    public void adicionarObservador(ObservadorDisco observador) {
        observadorDiscoList.add(observador);
    }

    private void notificarObservadores(Disco disco){
        for (ObservadorDisco observador : observadorDiscoList){
            if (observador.getInteresse().interessado(disco)){
                String mensagem = "Novo disco adicionado: " + disco.getTitulo();
                observador.getNotificador().enviar(mensagem);
            }
        }
    }

}
