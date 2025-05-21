package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Album;
import br.edu.ifpb.ads.padroes.atv1.strategy.NotificationStrategy;

import java.util.LinkedList;
import java.util.List;

public class ArtistObserver extends Observer<Album> {

    private final List<String> artistNotifications = new LinkedList<>();

    public ArtistObserver(NotificationStrategy notificationService) {
        super(notificationService);
    }

    public void addArtistNotification(String artist) {
        artistNotifications.add(artist);
    }

    @Override
    public void update(Album album) {
        artistNotifications.stream().filter(d -> album.getArtist().contains(d)).forEach(d -> {
            super.getNotificationService().sendNotification("Novo disco do artista: " + album.getArtist());
        });

    }
}
