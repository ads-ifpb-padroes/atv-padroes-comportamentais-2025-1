package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Album;
import br.edu.ifpb.ads.padroes.atv1.strategy.NotificationStrategy;

import java.util.LinkedList;
import java.util.List;

public class GenreObserver extends Observer<Album> {

    private final List<String> genreNotifications = new LinkedList<>();

    public GenreObserver(NotificationStrategy notificationService) {
        super(notificationService);
    }

    public void addGenreNotification(String genre) {
        genreNotifications.add(genre);
    }

    @Override
    public void update(Album album) {
        genreNotifications.stream().filter(d -> album.getGenre().contains(d)).forEach(d -> {
            super.getNotificationService().sendNotification("Novo disco do gênero: " + album.getGenre());
        });
    }
}
