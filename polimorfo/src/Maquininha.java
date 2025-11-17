public class Maquininha {

    private PessoaJuridica empresa;

    public Maquininha(PessoaJuridica empresa) {
        this.empresa = empresa;
    }

    public void cobrar(double valor) {
        System.out.println("Cobrança realizada: R$ " + valor);
    }
}
