public class Anfibio extends Animal {
    public Anfibio(String nome, String habitat) {
        super(nome, habitat);
    }

    public void alternarAmbiente() {
        System.out.println(getNome() + " alternou entre água e terra.");
    }
}
