package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Album;
import br.edu.ifpb.ads.padroes.atv1.strategy.NotificationStrategy;

import java.util.LinkedList;
import java.util.List;

public class TitleObserver extends Observer<Album> {

    private final List<String> titleNotifications = new LinkedList<>();

    public TitleObserver(NotificationStrategy notificationService) {
        super(notificationService);
    }

    public void addTitleNotification(String title) {
        titleNotifications.add(title);
    }

    @Override
    public void update(Album album) {
        titleNotifications.stream().filter(d -> album.getTitle().contains(d)).forEach(d -> {
            super.getNotificationService().sendNotification("Novo disco adicionado: " + album.getTitle());
        });
    }
}
