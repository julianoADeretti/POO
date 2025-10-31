public class Main {
    public static void main(String[] args) {

//sempre mostrar os nomes dos magos q irao batalhar
//mostrar atualizaçao da luta qual ataque foi usado- quanto dano foi dado -a vida do mago- a mana q ele tem
// e mostra um contador das rodadas e na ultima aparece ULTIMA RODADA

        System.out.println("--REGRAS--");
        System.out.println("SEGUE AS INFORMAÇOES SOBRE A CRIAÇAO DO MAGO");
        System.out.println("um adendo se o mago tiver grimorio e varinha ele sera uma um mestre dos magos e so pd ser adicionado um mestre dos magos");
        System.out.println("O nome do mago\n" +
                "O elemento dele(EX:fogo,agua ETC)\n" +
                "Três feitiços\n" +
                "Um ataque comum\n" +
                "Uma defesa\n" +
                "Um ataque especial\n" +
                "Se o mago possui grimório\n" +
                "Se o mago possui varinha");
        System.out.println("SEGUE AS INFOMAÇOES SOBRE OQUE O GRIMORIO E A VARINHA FAZEM COM O MAGO");
        System.out.println("Se o mago tem grimório, ele:\n" +
                "Precisa de 3 rodadas para liberar o ataque especial.\n" +
                 "O grimório aumenta a mana total do mago.\n" +
                 "Após usar o especial, o mago ainda tem mana suficiente para um ataque normal antes de precisar recarregar.");
        System.out.println("Efeitos do Acessório\n" +
                "Se o mago tem acessório, ele:\n" +
                "Precisa de 4 rodadas para liberar o ataque especial.\n" +
                "O acessório aumenta o dano total dos ataques.\n" +
                "Depois de usar o ataque especial, o mago perde toda a mana e precisa recarregar completamente antes de atacar novamente.");
        System.out.println(" A mana define quantas ações mágicas o mago pode executar:\n" +
                "Cada ataque comum consome (X) ponto de mana.\n" +
                "O ataque especial consome toda a mana (exceto no caso do grimório, que deixa sobrar energia para 1 ataque extra).\n" +
                "O mago precisa recarregar a mana após gastá-la toda.");
        System.out.println("Resumo rápido\n" +
                "Grimório\t4 rodadas\tDano Normal\tSobra 1 ataque" +
                "Varinha\t5 rodadas\tDano Aumentado\tZera completamente\tDano elevado\n" +
                "Grimório + Acessório\t3 rodadas (insta kill)\tINFINITO\tIrrelevante\tDRIP MÁXIMO \uD83D\uDE0E");

    }
}

/*
pergunta ao usuario para criar um nome do mago,qual o elemento dele,tres feitiços sendo um ataque
uma defesa  e um ateque especial solicitar se o mago tem grimorio e acessorio
(se o mago tiver grimorio e acessorio mostra uma mensagem q ele atingiu o drip maximo e
tambem fala q o ataque especial dele data insta kill no oponente)
(se o mago tiver grimorio ele precisa apenas de 3 rodadas para dar um ataque especial o grimorio aumenta a
quantidade de mana do mago EX:se ele solta um especial ele ainda vai ter mana para um ataque antes de recarregar a mana)
(se o mago ticer acessorio ele precisara de 4 rodadas mas ele dara mais dano pois o acessorio aumenta o dano
mas ele perde total a mana dps de um especial ele tera q fazer recarga de mana
 */
//chama o construtor para fazer um embaralhamento dos dados do mago (vida,dano e por ai vai
//           System.out.println("");