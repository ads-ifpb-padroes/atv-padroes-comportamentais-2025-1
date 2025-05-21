package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.observer.*;
import br.edu.ifpb.ads.padroes.atv1.strategy.EmailNotificationStrategy;
import br.edu.ifpb.ads.padroes.atv1.strategy.NotificationStrategy;
import br.edu.ifpb.ads.padroes.atv1.strategy.PushNotificationStrategy;
import br.edu.ifpb.ads.padroes.atv1.strategy.SmsNotificationStrategy;

public class Main {
    public static void main(String[] args) {

        NotificationStrategy emailNotification = new EmailNotificationStrategy();
        NotificationStrategy pushNotification = new PushNotificationStrategy();
        NotificationStrategy smsNotification = new SmsNotificationStrategy();

        TitleObserver titleObserver = new TitleObserver(emailNotification);
        titleObserver.addTitleNotification("Caneta Azul");

        ArtistObserver artistObserver = new ArtistObserver(pushNotification);
        artistObserver.addArtistNotification("Matuê");

        GenreObserver genreObserver = new GenreObserver(smsNotification);
        genreObserver.addGenreNotification("Forró");

        AlbumsSubject albumsSubject = new AlbumsSubject();

        albumsSubject.addObserver(titleObserver);
        albumsSubject.addObserver(artistObserver);
        albumsSubject.addObserver(genreObserver);

        Album album1 = new Album("Manoel Gomes", "Caneta Azul", "Poesia", 2020);
        Album album2 = new Album("Matuê", "333", "Trap", 2024);
        Album album3 = new Album("Wesley Safadão", "Bem-vindo ao meu mundo", "Forró", 2024);
        Album album4 = new Album("Banda Calypso", "A lua me traiu", "Triste", 2000);

        albumsSubject.addAlbum(album1);
        albumsSubject.addAlbum(album2);
        albumsSubject.addAlbum(album3);
        albumsSubject.addAlbum(album4);
    }
}
