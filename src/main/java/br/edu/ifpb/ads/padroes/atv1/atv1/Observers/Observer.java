package br.edu.ifpb.ads.padroes.atv1.atv1.Observers;

import br.edu.ifpb.ads.padroes.atv1.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.atv1.Services.ServiceNotificationStrategy;

public interface Observer {

    void notificar(Disco disco, ServiceNotificationStrategy canal);
}
