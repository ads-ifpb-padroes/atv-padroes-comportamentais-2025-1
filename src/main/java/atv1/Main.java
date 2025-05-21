package atv1;

public class Main {

    public static void main(String[] args) {
        // Criar o repositório de discos
        RepositorioDiscos repositorio = new RepositorioDiscos();

        // Criar notificadores (canais)
        Notificacao email = new NotificarPorEmail();
        Notificacao sms = new NotificarPorSMS();
        Notificacao push = new NotificarPorPush();

        // Adicionar interesses com diferentes critérios e canais
        repositorio.adicionarInteresse(new Observer("artista", "Beatles", email));
        repositorio.adicionarInteresse(new Observer("genero", "Rock", sms));
        repositorio.adicionarInteresse(new Observer("titulo", "Abbey Road", push));
        repositorio.adicionarInteresse(new Observer("genero", "Jazz", email));

        // Adicionar discos e observar os resultados
        System.out.println("\n--- Adicionando Abbey Road ---");
        repositorio.addDisco(new Disco("The Beatles", "Abbey Road", "Rock", 1969));

        System.out.println("\n--- Adicionando Kind of Blue ---");
        repositorio.addDisco(new Disco("Miles Davis", "Kind of Blue", "Jazz", 1959));

        System.out.println("\n--- Adicionando outro disco aleatório ---");
        repositorio.addDisco(new Disco("Pink Floyd", "The Wall", "Progressive Rock", 1979));
    }
}
