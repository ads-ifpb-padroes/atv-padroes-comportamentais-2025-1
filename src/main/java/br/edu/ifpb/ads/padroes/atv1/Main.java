package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.models.Disco;
import br.edu.ifpb.ads.padroes.atv1.notifiers.EmailNotifier;
import br.edu.ifpb.ads.padroes.atv1.notifiers.PushNotifier;
import br.edu.ifpb.ads.padroes.atv1.notifiers.SMSNotifier;
import br.edu.ifpb.ads.padroes.atv1.observers.AnoLancamentoObserver;
import br.edu.ifpb.ads.padroes.atv1.observers.ArtistaObserver;
import br.edu.ifpb.ads.padroes.atv1.observers.GeneroObserver;
import br.edu.ifpb.ads.padroes.atv1.observers.TituloObserver;
import br.edu.ifpb.ads.padroes.atv1.models.DiscoRepository;

public class Main {
  public static void main(String[] args) {
    SMSNotifier smsNotifier = new SMSNotifier("(83) 9 9999-9999");
    EmailNotifier emailNotifier = new EmailNotifier("erick@email.com");
    PushNotifier pushNotifier = new PushNotifier("furao@3000");

    ArtistaObserver artistaObserver = new ArtistaObserver(d -> d.getArtista() == "fica na tua", smsNotifier);
    GeneroObserver generoObserver = new GeneroObserver(d -> d.getGenero() == "rock nacional", emailNotifier);
    TituloObserver tituloObserver = new TituloObserver(d -> d.getTitulo() == "marra pura", pushNotifier);
    AnoLancamentoObserver anoLancamentoObserver = new AnoLancamentoObserver(d -> d.getAnoLancamento() == 1990, pushNotifier);

    DiscoRepository rep = new DiscoRepository();
    rep.addObserver(artistaObserver);
    rep.addObserver(generoObserver);
    rep.addObserver(tituloObserver);
    rep.addObserver(anoLancamentoObserver);

    rep.addDisco(new Disco("legiao urbana", "sim! eu fumo cigarro.", "rock nacional", 1990));
    System.out.println();
    rep.addDisco(new Disco("skank", "bola na area nao altera o placar", "rock nacional", 2005));
    System.out.println();
    rep.addDisco(new Disco("charlie brown jr", "surfando na areia", "rock nacional", 2005));
    System.out.println();
    rep.addDisco(new Disco("fica na tua", "marra pura", "pagode", 2010));
  }
}
