public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Poupança não permite saldo negativo!");
        }
    }
}
