package br.edu.ifpb.ads.padroes.atv1.atv2;

public class ImpressaoLicencaVisitor extends ImpressaoVisitor implements LicencaVisitor {

    public Object visit(LicencaDeSoftware licenca) {
        return String.format("Licença de Software: %s - Valor: R$ %.2f",
                licenca.getNome(), licenca.getValor());
    }
}