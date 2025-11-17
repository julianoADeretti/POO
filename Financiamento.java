public class Financiamento {

    private Pessoa cliente;
    private double valorTotal;
    private int meses;

    public Financiamento(Pessoa cliente, double valorTotal, int meses) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.meses = meses;
    }

    public double getParcela() {
        return valorTotal / meses;
    }
}
