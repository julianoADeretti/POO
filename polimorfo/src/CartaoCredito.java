public class CartaoCredito {

    private Pessoa titular;
    private double limite;

    public CartaoCredito(Pessoa titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void comprar(double valor) {
        if (limite >= valor) {
            limite -= valor;
            System.out.println("Compra aprovada!");
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}
