package br.edu.ifpb.ads.padroes.atv1.repositorio;

import br.edu.ifpb.ads.padroes.atv1.ServicoNotificacao;
import br.edu.ifpb.ads.padroes.atv1.interesse.Interessado;
import br.edu.ifpb.ads.padroes.atv1.modelo.Disco;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    private  List<Interessado> interessados = new LinkedList<>();

    private String canalNotificacao;

    private List<String> notificacoesDisco = new LinkedList<>();
    private List<String> notificacoesArtista = new LinkedList<>();
    private List<String> notificacoesGenero = new LinkedList<>();

    private ServicoNotificacao servicoNotificacao = new ServicoNotificacao();

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
        notificarInteressados(disco);
    }
    public  void  addInteressado(Interessado interessado){
        interessados.add(interessado);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    public String getCanalNotificacao() {
        return canalNotificacao;
    }

    public void setCanalNotificacao(String canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public void addNotificacaoDisco(String disco) {
        notificacoesDisco.add(disco);
    }

    public void addNotificacaoArtista(String artista) {
        notificacoesArtista.add(artista);
    }

    public void addNotificacaoGenero(String genero) {
        notificacoesGenero.add(genero);
    }

    private void notificarInteressados(Disco disco) {
        for (Interessado i: interessados){
            if (i.isInteressado(disco)){
                i.notificar(disco);
            }
        }
    }

}
