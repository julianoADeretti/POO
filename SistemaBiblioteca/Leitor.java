public class Leitor extends Usuario {

    public Leitor(String nome) {
        super(nome, "L" + System.currentTimeMillis());
    }

    public Leitor(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void mostrarMenu() {}
}