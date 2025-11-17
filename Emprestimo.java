public class Emprestimo {

    private Pessoa cliente;
    private double valor;
    private double juros;

    public Emprestimo(Pessoa cliente, double valor, double juros) {
        this.cliente = cliente;
        this.valor = valor;
        this.juros = juros;
    }

    public double calcularTotal() {
        return valor * (1 + juros);
    }
}
