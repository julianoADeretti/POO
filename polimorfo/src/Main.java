import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // LISTAS
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Conta> contas = new ArrayList<>();
    static ArrayList<CartaoCredito> cartoes = new ArrayList<>();
    static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    static ArrayList<Financiamento> financiamentos = new ArrayList<>();
    static ArrayList<Maquininha> maquininhas = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n======= MENU BANCO =======");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Criar Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Emitir Cartão de Crédito");
            System.out.println("6 - Solicitar Empréstimo");
            System.out.println("7 - Solicitar Financiamento");
            System.out.println("8 - Usar Maquininha");
            System.out.println("9 - Mostrar Saldo da Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); /* <--- buffer
            oq q um buffer -
            Um buffer é uma “área de espera” na memória que guarda dados
            temporariamente antes de eles serem usados, enviados ou processados.
            Em poucas palavras:
            Ele evita perda de dados e organiza a leitura/escrita para não travar o programa.
            */

            switch (opcao) {
                /*
                Por que isso é melhor?
                1. Não precisa de break
                No switch antigo, você precisava lembrar de colocar break; em cada case.
                Se esquecesse → caía no próximo caso (erro comum).
                1. O switch lê o valor de opcao
                Exemplo: o usuário digita 2.
                2. Ele compara com os cases
                Quando encontra:
                Executa criarConta()
                Finaliza o switch automaticamente
                Não passa para o próximo case
                Não precisa de break
                 */
                case 1 -> criarPessoa();
                case 2 -> criarConta();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> emitirCartao();
                case 6 -> solicitarEmprestimo();
                case 7 -> solicitarFinanciamento();
                case 8 -> usarMaquininha();
                case 9 -> mostrarSaldo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }


    public static void criarPessoa() {
        System.out.println("\n-- Criar Pessoa --");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.println("3 - Menor de Idade");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Documento (CPF/CNPJ): ");
        String doc = sc.nextLine();

        Pessoa p = null;

        switch (tipo) {
            case 1 -> p = new PessoaFisica(nome, doc);
            case 2 -> p = new PessoaJuridica(nome, doc);
            case 3 -> {
                System.out.println("\nEscolha o responsável:");
                mostrarPessoas();
                int respIndex = sc.nextInt();
                sc.nextLine();
                PessoaFisica responsavel = (PessoaFisica) pessoas.get(respIndex);

                p = new MenorIdade(nome, doc, responsavel);
            }
            default -> System.out.println("Tipo inválido!");
        }

        if (p != null) {
            pessoas.add(p);
            System.out.println("Pessoa criada com sucesso!");
        }
    }


    public static void criarConta() {
        System.out.println("\n-- Criar Conta --");
        System.out.println("Escolha o titular:");
        mostrarPessoas();
        int indexPessoa = sc.nextInt();
        sc.nextLine();

        Pessoa titular = pessoas.get(indexPessoa);

        System.out.println("\nTipo de conta:");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupança");
        System.out.println("3 - Salário");
        System.out.println("4 - Digital");
        System.out.println("5 - Empresarial (PJ)");
        System.out.println("6 - MEI (PJ)");
        System.out.println("7 - Infantil (menor)");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        Conta c = null;

        switch (tipo) {
            case 1 -> c = new ContaCorrente(titular);
            case 2 -> c = new ContaPoupanca(titular);
            case 3 -> c = new ContaSalario(titular);
            case 4 -> c = new ContaDigital(titular);
            case 5 -> c = new ContaEmpresarial(titular);
            case 6 -> c = new ContaMEI((PessoaJuridica) titular);
            case 7 -> c = new ContaInfantil((MenorIdade) titular);
            default -> System.out.println("Tipo inválido!");
        }

        if (c != null) {
            contas.add(c);
            System.out.println("Conta criada com sucesso!");
        }
    }


    public static void depositar() {
        System.out.println("\n-- Depositar --");
        mostrarContas();
        System.out.print("Escolha a conta: ");
        int index = sc.nextInt();

        System.out.print("Valor: ");
        double v = sc.nextDouble();

        contas.get(index).depositar(v);
        System.out.println("Depósito realizado!");
    }


    public static void sacar() {
        System.out.println("\n-- Sacar --");
        mostrarContas();
        System.out.print("Escolha a conta: ");
        int index = sc.nextInt();

        System.out.print("Valor: ");
        double v = sc.nextDouble();

        contas.get(index).sacar(v);
        System.out.println("Saque realizado!");
    }


    public static void emitirCartao() {
        System.out.println("\n-- Emitir Cartão --");

        mostrarPessoas();
        System.out.print("Escolha o titular: ");
        int index = sc.nextInt();

        System.out.print("Limite inicial: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao = new CartaoCredito(pessoas.get(index), limite);
        cartoes.add(cartao);

        System.out.println("Cartão emitido com sucesso!");
    }

    public static void solicitarEmprestimo() {
        System.out.println("\n-- Empréstimo --");

        mostrarPessoas();
        System.out.print("Titular: ");
        int index = sc.nextInt();

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        System.out.print("Juros (ex: 0.15): ");
        double juros = sc.nextDouble();

        emprestimos.add(new Emprestimo(pessoas.get(index), valor, juros));
        System.out.println("Empréstimo solicitado!");
    }


    public static void solicitarFinanciamento() {
        System.out.println("\n-- Financiamento --");

        mostrarPessoas();
        System.out.print("Titular: ");
        int index = sc.nextInt();

        System.out.print("Valor total: ");
        double valor = sc.nextDouble();

        System.out.print("Meses: ");
        int meses = sc.nextInt();

        financiamentos.add(new Financiamento(pessoas.get(index), valor, meses));

        System.out.println("Financiamento cadastrado!");
    }


    public static void usarMaquininha() {
        System.out.println("\n-- Maquininha --");

        mostrarPessoas();
        System.out.print("Escolha empresa (PJ): ");
        int index = sc.nextInt();

        PessoaJuridica pj = (PessoaJuridica) pessoas.get(index);

        Maquininha maq = new Maquininha(pj);
        maquininhas.add(maq);

        System.out.print("Valor cobrança: ");
        double v = sc.nextDouble();

        maq.cobrar(v);
    }

    public static void mostrarSaldo() {
        mostrarContas();
        System.out.print("Escolha: ");
        int index = sc.nextInt();

        System.out.println("Saldo: " + contas.get(index).getSaldo());
    }



    public static void mostrarPessoas() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + " - " + pessoas.get(i).getNome());
        }
    }

    public static void mostrarContas() {
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(i + " - " + contas.get(i).getTitular().getNome() + " | Saldo: " + contas.get(i).getSaldo());
        }
    }
}
