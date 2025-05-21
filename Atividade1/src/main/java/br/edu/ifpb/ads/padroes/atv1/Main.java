package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interesse.Interesse;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteresseArtista;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteresseGenero;
import br.edu.ifpb.ads.padroes.atv1.interesse.InteresseTitulo;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.NotificacaoEmail;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.NotificacaoPush;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.NotificacaoSMS;
import br.edu.ifpb.ads.padroes.atv1.notificacoes.ServicoNotificacoes;

public class Main {
    public static void main(String[] args) {
        Disco disco = new Disco("System of a Down", "Toxicity", "Metal", 2002);

        Observer usuario = new Observer("Daniel");
        ServicoNotificacoes email = new NotificacaoEmail();
        ServicoNotificacoes sms = new NotificacaoSMS();
        ServicoNotificacoes push = new NotificacaoPush();

        Interesse interesse = new InteresseGenero("Metal");

        usuario.adicionarCanalNotificacao(push);
        usuario.addInteresse(interesse);


        RepositorioDiscos repositorioDiscos = new RepositorioDiscos();
        repositorioDiscos.adicionarObserver(usuario);
        repositorioDiscos.adicionarDisco(disco); 
    }
}
