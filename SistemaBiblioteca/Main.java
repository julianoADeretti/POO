import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("1 - Leitor");
            System.out.println("2 - Funcionário");
            System.out.println("0 - Sair");
            System.out.print("> ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) menuLeitor(sc, biblioteca);
            else if (op == 2) menuFuncionario(sc, biblioteca);
            else if (op == 0) break;
        }
    }

    public static void menuLeitor(Scanner sc, Biblioteca biblioteca) {
        Leitor leitor = new Leitor("Leitor");

        while (true) {
            System.out.println("1 - Buscar livro");
            System.out.println("2 - Ver livros");
            System.out.println("0 - Voltar");
            System.out.print("> ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o código do livro:");
                System.out.print("> ");
                String codigo = sc.nextLine();

                Livro livro = biblioteca.buscar(codigo);

                if (livro == null) {
                    System.out.println("Livro não encontrado.");
                } else {
                    System.out.println(livro);
                    System.out.println("Deseja pegar o livro? (1 = Sim / 0 = Não)");
                    System.out.print("> ");
                    int escolha = sc.nextInt();
                    sc.nextLine();

                    if (escolha == 1) livro.diminuir();
                }

            } else if (op == 2) {
                for (Livro l : biblioteca.listar()) System.out.println(l);

            } else if (op == 0) break;
        }
    }

    public static void menuFuncionario(Scanner sc, Biblioteca biblioteca) {
        Funcionario funcionario = new Funcionario("Funcionario");

        while (true) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Ver livros");
            System.out.println("0 - Voltar");
            System.out.print("> ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o título:");
                System.out.print("> ");
                String titulo = sc.nextLine();

                System.out.println("Digite o código:");
                System.out.print("> ");
                String codigo = sc.nextLine();

                if (biblioteca.codigoExiste(codigo)) {
                    System.out.println("Código já está em uso.");
                    System.out.println("Último código usado: " + biblioteca.ultimoCodigo());
                    System.out.println("Sugestão de próximo código: " + biblioteca.proximoCodigo());
                    continue;
                }

                System.out.println("Digite a quantidade:");
                System.out.print("> ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                biblioteca.adicionarLivro(titulo, codigo, quantidade);
                System.out.println("Livro cadastrado com sucesso!");

            } else if (op == 2) {
                for (Livro l : biblioteca.listar()) System.out.println(l);

            } else if (op == 0) break;
        }
    }
}
