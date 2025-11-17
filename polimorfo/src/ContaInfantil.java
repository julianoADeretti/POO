public class ContaInfantil extends Conta {

    public ContaInfantil(MenorIdade titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Conta infantil não permite saldo negativo!");
        }
    }
}
