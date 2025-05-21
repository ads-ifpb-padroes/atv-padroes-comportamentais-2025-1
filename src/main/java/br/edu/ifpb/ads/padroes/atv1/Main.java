package br.edu.ifpb.ads.padroes.atv1;

public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repo = new RepositorioDiscos();

        FormaNotificacao email = new NotificacaoEmail();
        FormaNotificacao sms = new NotificacaoSMS();
        FormaNotificacao push = new NotificacaoPush();

        repo.addObserver(new InscritoObserver("Abbey Road", null, null, email));
        repo.addObserver(new InscritoObserver(null, "Queen", null, sms));
        repo.addObserver(new InscritoObserver(null, null, "Rock", push));
        repo.addObserver(new InscritoObserver(null, "AC/DC", "Hard Rock", email));

        repo.addDisco(new Disco("Abbey Road", "The Beatles", "Rock", 1969));
        repo.addDisco(new Disco("A Night at the Opera", "Queen", "Rock", 1975));
        repo.addDisco(new Disco("Back in Black", "AC/DC", "Hard Rock", 1980));
    }
}
