package br.edu.ifpb.ads.padroes.atv1.notifiers;

public class EmailNotifier extends AbstractNotifier {
  public EmailNotifier(String email) {
    super(email);
  }

  @Override
  public void notify(String message) {
    System.out.println("Enviando Email para: " + super.getAddress() + " - " + message);
  }
}
