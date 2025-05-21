package br.edu.ifpb.ads.padroes.atv1.repositorio;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interessado;
import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos implements  SubjectRepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    private  List<Interessado> interessados = new LinkedList<>();
    private Disco discoInteressado;


    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        discoInteressado = disco;
        notificacao();
    }

    @Override
    public void add(Interessado interessado) {
        interessados.add(interessado);
    }

    @Override
    public void remove(Interessado interessado) {
        interessados.remove(interessado);
    }

    @Override
    public void notificacao() {
        for (Interessado i: interessados){
            i.notificar(discoInteressado);
        }
    }

}
