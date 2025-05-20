package br.edu.ifpb.ads.padroes.atv1.atv2;

public class RelatorioDeImpostosLicencaVisitor extends RelatorioDeImpostosVisitor implements LicencaVisitor {
    private static final double TAXA_IMPOSTO_LICENCA_SOFTWARE = 0.20; // 20%

    public Object visit(LicencaDeSoftware licenca) {
        double valorImposto = licenca.getValor() * TAXA_IMPOSTO_LICENCA_SOFTWARE;
        return valorImposto;
    }
}