import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Batalha batalha = new Batalha();

        while (true) {
            System.out.println("\n===== CRIAÇÃO DOS MAGOS =====");
            ArrayList<Mago> magos = new ArrayList<>();
            boolean mestreCriado = false;
            while (true) {
                System.out.print("Deseja criar um novo mago? (s/n): ");
                String opc = sc.nextLine().trim().toLowerCase();
                if (opc.equals("n")) break;
                System.out.print("Nome do mago: ");
                String nome = sc.nextLine();
                System.out.print("Elemento do mago: ");
                String magia = sc.nextLine();
                System.out.print("Nome do feitiço de ataque comum: ");
                String ataqueComum = sc.nextLine();
                System.out.print("Nome do feitiço de defesa: ");
                String defesa = sc.nextLine();
                System.out.print("Nome do ataque especial: ");
                String especial = sc.nextLine();
                System.out.print("Possui grimório? true para(SIM) e false para (NAO): ");
                boolean grimorio = Boolean.parseBoolean(sc.nextLine());
                System.out.print("Possui varinha? true para(SIM) e false para (NAO): ");
                boolean acessorio = Boolean.parseBoolean(sc.nextLine());
                if (grimorio && acessorio) {
                    if (mestreCriado) {
                        System.out.println("Já existe um Mestre dos Magos. Você não pode criar outro.");
                        continue;
                    } else {
                        mestreCriado = true;
                        System.out.println(nome + " se tornou o Mestre dos Magos!");
                    }
                }
                float vida = 100;
                float mana = 100;
                float forca = 10;
                Mago novo = new Mago(vida, mana, magia, 3, forca, grimorio, acessorio);
                novo.setNome(nome);
                novo.setAtaqueComum(ataqueComum);
                novo.setDefesa(defesa);
                novo.setEspecial(especial);
                magos.add(novo);
                System.out.println("Mago " + nome + " criado com sucesso!");
            }
            if (magos.size() < 2) {
                System.out.println("Você precisa criar pelo menos dois magos para iniciar uma batalha.");
                continue;
            }
            System.out.println("\n===== INÍCIO DAS BATALHAS =====");
            while (magos.size() > 1) {
                Collections.shuffle(magos);
                Mago m1 = magos.get(0);
                Mago m2 = magos.get(1);
                batalha.iniciarBatalha(m1, m2);
                if (m1.getVida() <= 0) magos.remove(m1);
                else if (m2.getVida() <= 0) magos.remove(m2);
                if (magos.size() == 1) {
                    System.out.println("\nO grande vencedor do torneio é " + magos.get(0).getNome() + "!");
                }
            }
            System.out.print("\nDeseja começar um novo torneio? (s/n): ");
            String again = sc.nextLine().trim().toLowerCase();
            if (again.equals("n")) {
                System.out.println("Encerrando o programa...");
                break;
            }
        }
    }
}
