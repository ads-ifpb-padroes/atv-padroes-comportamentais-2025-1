package br.edu.ifpb.ads.padroes.atv1.notifiers;

// Example implementation of Notifier
public class SMSNotifier extends AbstractNotifier {
  public SMSNotifier(String address) {
    super(address);
  }

  @Override
  public void notify(String message) {
    System.out.println("Enviando SMS para: " + super.getAddress() + " - " + message);
  }
}
