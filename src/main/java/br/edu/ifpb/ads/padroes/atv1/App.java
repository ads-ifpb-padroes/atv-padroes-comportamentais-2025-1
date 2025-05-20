package br.edu.ifpb.ads.padroes.atv1;

public class App {
    public static void main(String[] args) {
        //Criando disco
        Disco disco = new Disco("System of a Down","Toxicity","ROCK",2001);
        //Criando repositorios do disco
        RepositorioDiscos repDiscos = new RepositorioDiscos();

        //Criando Servico de notificacao
        ServicoNotificacao servicoEmail = new ServicoNotificacaoEmail();

        //Adicionando o interesse do qual usuario quer receber notificação e o serviço pelo qual ele quer receber a notificação
        repDiscos.addInteresseUsuario(new InteresseTitulo(disco.getTitulo(),servicoEmail));

        //Adicionando o disco a lista de discos e notificando aos interessados
        repDiscos.addDisco(disco);

    }
}