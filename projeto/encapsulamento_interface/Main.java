public class Main {
    public static void main(String[] args) {
        IConta conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(30);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
