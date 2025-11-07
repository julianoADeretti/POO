import java.util.ArrayList;
import java.util.Random;

public class Batalha {

    private Random random = new Random();

    public void iniciarBatalha(Mago mago1, Mago mago2) {
        System.out.println("A batalha vai começar entre " + mago1.getMagia() + " e " + mago2.getMagia() + "!");
        int rodada = 1;
        while (mago1.getVida() > 0 && mago2.getVida() > 0) {
            System.out.println("\nRodada " + rodada + ":");
            executarTurno(mago1, mago2);
            if (mago2.getVida() <= 0) break;
            executarTurno(mago2, mago1);
            rodada++;
        }
        if (mago1.getVida() <= 0 && mago2.getVida() <= 0) {
            System.out.println("Ambos os magos caíram! A batalha terminou em empate.");
        } else if (mago1.getVida() <= 0) {
            System.out.println(mago2.getMagia() + " venceu a batalha!");
        } else {
            System.out.println(mago1.getMagia() + " venceu a batalha!");
        }
    }
    private void executarTurno(Mago atacante, Mago defensor) {
        if (atacante.getMana() < 15) {
            System.out.println(atacante.getMagia() + " está sem energia e precisa regenerar mana.");
            atacante.setMana(atacante.getMana() + 20);
            System.out.println("Ele recupera sua energia e agora tem " + atacante.getMana() + " de mana.");
            return;
        }
        if (atacante.getVida() < 20) {
            System.out.println(atacante.getMagia() + " está enfraquecido e libera seu ataque especial!");
            ataqueEspecial(atacante, defensor);
            return;
        }
        int ataque = random.nextInt(30) + 1;
        int defesa = random.nextInt(20) + 1;
        int perdaMana = random.nextInt(26) + 15; // de 15 a 40
        atacante.setMana(atacante.getMana() - perdaMana);
        if (atacante.isAcessorio()) {
            ataque += 7;
            System.out.println(atacante.getMagia() + " canaliza o poder de sua varinha, aumentando seu ataque!");
        }
        System.out.println(atacante.getMagia() + " ataca com força de " + ataque + ".");
        System.out.println(defensor.getMagia() + " ergue sua defesa de " + defesa + ".");
        if (ataque > defesa) {
            int dano = ataque - defesa;
            defensor.setVida(defensor.getVida() - dano);
            System.out.println("O ataque acerta em cheio! " + defensor.getMagia() + " perde " + dano + " de vida.");
        } else {
            System.out.println("O ataque foi bloqueado por completo!");
        }
        System.out.println("Vida de " + defensor.getMagia() + ": " + defensor.getVida());
        System.out.println("Mana de " + atacante.getMagia() + ": " + atacante.getMana());
    }
    private void ataqueEspecial(Mago atacante, Mago defensor) {
        int ataqueEspecial = random.nextInt(31) + 30; // 30 a 60
        int defesaEspecial = random.nextInt(21) + 20; // 20 a 40
        int danoFinal = ataqueEspecial - defesaEspecial;
        if (danoFinal < 0) danoFinal = 0;
        System.out.println(atacante.getMagia() + " lança seu ataque especial com poder de " + ataqueEspecial + "!");
        System.out.println(defensor.getMagia() + " tenta resistir com defesa de " + defesaEspecial + ".");
        if (danoFinal > 0) {
            defensor.setVida(defensor.getVida() - danoFinal);
            System.out.println("O ataque especial causa " + danoFinal + " de dano devastador!");
        } else {
            System.out.println(defensor.getMagia() + " consegue resistir ao ataque especial!");
        }
        atacante.setMana(0);
        System.out.println(atacante.getMagia() + " fica sem mana após usar seu ataque especial!");
    }
}
