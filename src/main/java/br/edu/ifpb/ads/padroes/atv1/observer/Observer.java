package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.strategy.NotificationStrategy;

public abstract class Observer<T> {

    private final NotificationStrategy notificationService;

    public Observer(NotificationStrategy notificationService) {
        this.notificationService = notificationService;
    }

    public NotificationStrategy getNotificationService() {
        return notificationService;
    }

    public abstract void update(T data);
}
