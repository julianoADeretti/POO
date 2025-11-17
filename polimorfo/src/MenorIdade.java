public class MenorIdade extends Pessoa {

    private PessoaFisica responsavel;

    public MenorIdade(String nome, String cpf, PessoaFisica responsavel) {
        super(nome, cpf);
        this.responsavel = responsavel;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }
}
