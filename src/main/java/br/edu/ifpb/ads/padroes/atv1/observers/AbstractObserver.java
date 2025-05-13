package br.edu.ifpb.ads.padroes.atv1.observers;

import java.util.function.Predicate;

import br.edu.ifpb.ads.padroes.atv1.models.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifiers.Notifier;

/**
 * Classe responsável por enviar notificações.
 */
public abstract class AbstractObserver implements Observer<Disco> {
  private Predicate<Disco> filter;
  private Notifier notifier;

  public AbstractObserver(Predicate<Disco> filter, Notifier notifier) {
    this.notifier = notifier;

    if (filter == null) {
      this.filter = d -> true;
    } else {
      this.filter = filter;
    }
  }

  public Predicate<Disco> getFilter() {
    return filter;
  }

  public void setFilter(Predicate<Disco> filter) {
    if (filter == null) {
      this.filter = d -> true;
    } else {
      this.filter = filter;
    }
  }

  public Notifier getNotifier() {
    return notifier;
  }

  public void setNotifier(Notifier notifier) {
    this.notifier = notifier;
  }
}
