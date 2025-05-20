package br.edu.ifpb.ads.padroes.atv1.atv1.Observers;

import br.edu.ifpb.ads.padroes.atv1.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.atv1.Services.ServiceNotificationStrategy;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoDisco implements Observer{
    private List<String> discos = new ArrayList<>();

    public void adicionarDisco(String disco) {
        discos.add(disco);
    }

    public void removerDisco(String disco) {
        discos.remove(disco);
    }

    @Override
    public void notificar(Disco disco, ServiceNotificationStrategy canal) {
        discos.stream().filter(d -> disco.getTitulo().contains(d)).forEach(d -> {
            canal.enviarNotificacao( "Novo disco adicionado: " + disco.getTitulo());
        });
    }
}
