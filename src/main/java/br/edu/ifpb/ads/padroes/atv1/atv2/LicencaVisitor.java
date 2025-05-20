package br.edu.ifpb.ads.padroes.atv1.atv2;

public interface LicencaVisitor extends Visitor {
    Object visit(LicencaDeSoftware licenca);
}