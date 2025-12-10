import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca() {
        livros.add(new Livro("one piece", "000", 4));
        livros.add(new Livro("jujutsu kaisen", "001", 4));
        livros.add(new Livro("hunter x hunter", "002", 4));
        livros.add(new Livro("blue lock", "003", 4));
        livros.add(new Livro("death note", "004", 4));
    }

    public boolean codigoExiste(String codigo) {
        for (Livro l : livros) {
            if (l.getCodigo().equals(codigo)) return true;
        }
        return false;
    }

    public String ultimoCodigo() {
        int maior = -1;
        for (Livro l : livros) {
            int n = Integer.parseInt(l.getCodigo());
            if (n > maior) maior = n;
        }
        return String.format("%03d", maior);
    }

    public String proximoCodigo() {
        int n = Integer.parseInt(ultimoCodigo()) + 1;
        return String.format("%03d", n);
    }

    public boolean adicionarLivro(String titulo, String codigo, int qtd) {
        if (codigoExiste(codigo)) return false;
        livros.add(new Livro(titulo, codigo, qtd));
        return true;
    }

    public ArrayList<Livro> listar() {
        return livros;
    }

    public Livro buscar(String codigo) {
        for (Livro l : livros) if (l.getCodigo().equals(codigo)) return l;
        return null;
    }
}