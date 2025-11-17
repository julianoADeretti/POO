public abstract class Conta {
    //mamae das contas
    protected Pessoa titular;
    protected double saldo;

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
