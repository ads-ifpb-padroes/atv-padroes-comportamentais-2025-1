package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.notifications.Email;
import br.edu.ifpb.ads.padroes.atv1.notifications.Push;
import br.edu.ifpb.ads.padroes.atv1.notifications.SMS;
import br.edu.ifpb.ads.padroes.atv1.observers.NotificacaoPorArtista;
import br.edu.ifpb.ads.padroes.atv1.observers.NotificacaoPorDisco;
import br.edu.ifpb.ads.padroes.atv1.observers.NotificacaoPorGenero;

public class Main {
    public static void main(String[] args) {
        // Cria o repositório de discos
        RepositorioDiscos repositorio = new RepositorioDiscos();

        // Registra interesse nas notificações
        repositorio.registrarInteresse(new NotificacaoPorArtista("Coldplay", new Email()));
        repositorio.registrarInteresse(new NotificacaoPorDisco("X&Y", new Push()));
        repositorio.registrarInteresse(new NotificacaoPorGenero("Rock", new SMS()));

        // Adiciona discos ao repositório
        repositorio.addDisco(new Disco("Coldplay", "X&Y", "Rock", 2005));  // Dispara todos
        repositorio.addDisco(new Disco("Imagine Dragons", "Night Visions", "Rock", 2012)); // Dispara SMS
        repositorio.addDisco(new Disco("Adele", "30", "Pop", 2021)); // Não dispara nada
    }
}
