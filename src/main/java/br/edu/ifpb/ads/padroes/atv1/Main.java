package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.canais.CanalEmail;
import br.edu.ifpb.ads.padroes.atv1.canais.CanalPush;
import br.edu.ifpb.ads.padroes.atv1.canais.CanalSMS;
import br.edu.ifpb.ads.padroes.atv1.canais.ServicoNotificacao;
import br.edu.ifpb.ads.padroes.atv1.interesse.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RepositorioDiscos repo = new RepositorioDiscos();

        //Aqui você escolhe qual a forma que deseja receber a notificação, usei todos os tipos permitidos, mas se não quiser receber notificação
        //basta escrever no objeto do tipo Interesse, no último parâmetro: List.of().

        ServicoNotificacao email = new CanalEmail("borabora@gmail.com");
        ServicoNotificacao sms = new CanalSMS("83940028922");
        ServicoNotificacao push = new CanalPush("borabora123");

        Interesse interesseTitulo = new InteresseTitulo("Duas Cidades", List.of(email));
        Interesse interesseArtista = new InteresseArtista( "Gilsons", List.of(sms));
        Interesse interesseGenero = new InteresseGenero( "Alternativa", List.of(push));

        repo.addInteresse(interesseTitulo);
        repo.addInteresse(interesseArtista);
        repo.addInteresse(interesseGenero);

        // --- Discos que notificam interesses específicos ---

        Disco disco1 = new Disco("Gilsons", "Duas Cidades", "Pop", 1980);
        repo.addDisco(disco1);

        Disco disco2 = new Disco("Rainbow Kitten Surprise", "It's Called: Freefall", "Alternativa", 2020);
        repo.addDisco(disco2);

        // Disco que notifica mais de um interesse ao mesmo tempo

        System.out.println("Enviando notificação geral\n");
        Disco disco3 = new Disco("Gilsons", "Proposta", "Alternativa", 2021);
        repo.addDisco(disco3);

    }
}
