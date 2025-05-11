package br.edu.ifpb.ads.padroes.atv1.app;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.repositorio.RepositorioDiscos;
import br.edu.ifpb.ads.padroes.atv1.canaisNotificacao.EmailNotificacao;
import br.edu.ifpb.ads.padroes.atv1.canaisNotificacao.PushNotificacao;
import br.edu.ifpb.ads.padroes.atv1.canaisNotificacao.SMSNotificacao;
import br.edu.ifpb.ads.padroes.atv1.observadores.ObservadorPorArtista;
import br.edu.ifpb.ads.padroes.atv1.observadores.ObservadorPorGenero;
import br.edu.ifpb.ads.padroes.atv1.observadores.ObservadorPorTitulo;

public class Main {
    public static void main(String[] args) {
        // Instanciando um repositório
        RepositorioDiscos repo = new RepositorioDiscos();

        // Instanciando os canais
        EmailNotificacao canalEmail = new EmailNotificacao();
        SMSNotificacao canalSMS = new SMSNotificacao();
        PushNotificacao canalPush = new PushNotificacao();

        // Instanciando Quem ouve por título
        ObservadorPorTitulo observadorPorTitulo1 = new ObservadorPorTitulo("Revolutions", canalEmail);
        ObservadorPorTitulo observadorPorTitulo2 = new ObservadorPorTitulo("Bury me alive", canalEmail);

        // Instanciando Quem ouve por artista
        ObservadorPorArtista observadorPorArtista = new ObservadorPorArtista("Metallica", canalSMS);
        
        // Instanciando Quem ouve por gênero
        ObservadorPorGenero observadorPorGenero1 = new ObservadorPorGenero("Rock", canalPush);
        ObservadorPorGenero observadorPorGenero2 = new ObservadorPorGenero("Rock", canalEmail);

        // Adicionando os observadores
        repo.addObservador(observadorPorTitulo1);
        repo.addObservador(observadorPorTitulo2);
        repo.addObservador(observadorPorArtista);
        repo.addObservador(observadorPorGenero1);
        repo.addObservador(observadorPorGenero2);

        // Instanciando um disco qualquer
        repo.addDisco(new Disco("Oliver Tree", "Bury me alive", "Rock", 2024));
    }
}
