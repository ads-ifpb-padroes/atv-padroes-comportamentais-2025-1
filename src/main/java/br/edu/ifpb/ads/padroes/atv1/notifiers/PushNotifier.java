package br.edu.ifpb.ads.padroes.atv1.notifiers;

// Example implementation of Notifier
public class PushNotifier extends AbstractNotifier {

  public PushNotifier(String address) {
    super(address);
  }

  @Override
  public void notify(String message) {
    System.out.println("Enviando Push para: " + super.getAddress() + " - " + message);
  }
}
