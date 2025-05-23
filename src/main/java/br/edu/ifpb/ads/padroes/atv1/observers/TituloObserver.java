package br.edu.ifpb.ads.padroes.atv1.observers;

import java.util.function.Predicate;

import br.edu.ifpb.ads.padroes.atv1.models.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifiers.Notifier;

/**
 * Classe responsável por enviar notificações.
 */
public class TituloObserver extends AbstractObserver {
  public TituloObserver(Predicate<Disco> filter, Notifier notifier) {
    super(filter, notifier);
  }

  @Override
  public void update(Disco disco) {
    if (super.getFilter().test(disco)) {
      super.getNotifier().notify("Novo disco adicionado: " + disco.getTitulo());
    }
  }
}
