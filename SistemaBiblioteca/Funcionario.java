public class Funcionario extends Usuario {

    public Funcionario(String nome) {
        super(nome, "F" + System.currentTimeMillis());
    }

    public Funcionario(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void mostrarMenu() {}
}