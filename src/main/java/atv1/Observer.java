package atv1;

import atv1.Notificacao;


public class Observer {
    private String tipo; // "titulo", "artista" ou "genero"
    private String valor;
    private Notificacao notificador;

    public Observer(String tipo, String valor, Notificacao notificador) {
        this.tipo = tipo.toLowerCase();
        this.valor = valor.toLowerCase();
        this.notificador = notificador;
    }

    public boolean corresponde(Disco disco) {
        return switch (tipo) {
            case "titulo" -> disco.getTitulo().toLowerCase().contains(valor);
            case "artista" -> disco.getArtista().toLowerCase().contains(valor);
            case "genero" -> disco.getGenero().toLowerCase().contains(valor);
            default -> false;
        };
    }

    public void notificar(Disco disco) {
        String mensagem = switch (tipo) {
            case "titulo" -> "Novo disco adicionado: " + disco.getTitulo();
            case "artista" -> "Novo disco do artista: " + disco.getArtista();
            case "genero" -> "Novo disco do gênero: " + disco.getGenero();
            default -> "Novo disco: " + disco.getTitulo();
        };
        notificador.notificar(mensagem);
    }
}
