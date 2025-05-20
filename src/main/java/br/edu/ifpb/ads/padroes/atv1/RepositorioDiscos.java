package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.strategy.ServicoNotificacaoStrategy;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();

    private List<String> notificacoesDisco = new LinkedList<>();
    private List<String> notificacoesArtista = new LinkedList<>();
    private List<String> notificacoesGenero = new LinkedList<>();

    private ServicoNotificacaoStrategy servicoNotificacao;

    public RepositorioDiscos(ServicoNotificacaoStrategy servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

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
        notificar(disco);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
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

    public ServicoNotificacaoStrategy getServicoNotificacao() {
        return servicoNotificacao;
    }

    public void setServicoNotificacao(ServicoNotificacaoStrategy servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    private void notificar(Disco disco) {
        notificacoesDisco.stream().filter(d -> disco.getTitulo().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao("Novo disco adicionado: " + disco.getTitulo());
        });

        notificacoesArtista.stream().filter(d -> disco.getArtista().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao("Novo disco do artista: " + disco.getArtista());
        });

        notificacoesGenero.stream().filter(d -> disco.getGenero().contains(d)).forEach(d -> {
            servicoNotificacao.enviarNotificacao("Novo disco do gênero: " + disco.getGenero());
        });
    }

}
