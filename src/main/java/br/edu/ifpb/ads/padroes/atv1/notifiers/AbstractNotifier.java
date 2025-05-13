package br.edu.ifpb.ads.padroes.atv1.notifiers;

public abstract class AbstractNotifier implements Notifier {
    private String address;

    public AbstractNotifier(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
