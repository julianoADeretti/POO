public class ContaSalario extends Conta {
    public ContaSalario(Pessoa titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Conta salário não pode ficar negativa!");
        }
    }
}
