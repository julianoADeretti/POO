public abstract class Pessoa {
    //mamae dos usuarios
    protected String nome;
    protected String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
