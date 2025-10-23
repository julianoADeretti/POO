public class BaseFone {

    int tipo;
    int quantidade;
    float bateria;
    String cor;
    String especie;




    public void mostrarTipo(){
        if(tipo == 1){
            System.out.println("Você tem um fone de fio ");
        }else if(tipo == 2){
            System.out.println("Você tem um fone blutu ");
        }else{
            System.out.println("Você tem um fone hibrido tanto de fio como blutu ");
        }
    }
    public void mostrarQuantidade() {
        if(quantidade > 4){
            System.out.println("Mentira tu n tem tanto ouvido");

        }else {
            System.out.println("Você tem " + quantidade + " fones.");
        }
    }
    public void testeBateria(){
        if(bateria < 0 || bateria > 100){
            System.out.println("Humanamente impossivel");

        }
    }
    public void status() {
        System.out.println("=== STATUS DO FONE ===");
        mostrarTipo();
        System.out.println("O tipo do seu fone é: " + quantidade);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Bateria: " + bateria);
        System.out.println("Você usa fone para " + especie);

    }
}
