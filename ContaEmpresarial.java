public class ContaEmpresarial extends Conta {

    public ContaEmpresarial(Pessoa titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        // Empresarial pode ficar negativa
        saldo -= valor;
    }
}
