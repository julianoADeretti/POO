public class Livro {
    private String titulo;
    private String codigo;
    private int quantidade;

    public Livro(String titulo, String codigo, int quantidade) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public String getTitulo() { return titulo; }
    public String getCodigo() { return codigo; }
    public int getQuantidade() { return quantidade; }

    public void diminuir() { if (quantidade > 0) quantidade--; }
    public void aumentar() { quantidade++; }

    @Override
    public String toString() {
        return titulo + " (" + codigo + ") - qtd: " + quantidade;
    }
}