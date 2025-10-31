public class Mago implements IMago {

    private float vida;
    private boolean grimorio;
    private boolean acessorio;
    private float mana;
    private String magia;
    private int feiticos;
    private float forca;

    public Mago(float vida, float mana, String magia, int feiticos, float forca, boolean grimorio, boolean acessorio) {
        this.vida = vida;
        this.mana = mana;
        this.magia = magia;
        this.feiticos = feiticos;
        this.forca = forca;
        this.grimorio = grimorio;
        this.acessorio = acessorio;
    }
    //o mago mestre tem apenas 1 de vida pois o usuario foi ganancioso mas como ele é um mestre dos magos o unico ataque
    // q pd dar dano no mestre é o especial
    //a defesa dele sempre sera == ao ataque inimigo e o ataque dele sempre 5 pontos mais fortes do q a defesa inimiga
    //entao ele sempre dara dano e nunk levara dano a n ser q seja um especial
    //toda luta contra um mestre no fim da segunda rodada sera rodado um dado da sorte D10 q se for tirado 1 ou 10 ele
    // quebrara a defesa do mestre e ficara sem defesa ate o final
    //ai vai na sorte quem atacar primeiro vence (se o mestre perder mostrar mensagem falando
    // "O MESTRE MORREU POIS ELE DEU TD SUA VIDA EM TROCA DE PODER ")


    public float getVida() {
        return vida;
    }


    public void setVida(float vida) {
        this.vida = vida;
    }


    public boolean isGrimorio() {
        return grimorio;
    }


    public void setGrimorio(boolean grimorio) {
        this.grimorio = grimorio;
    }


    public boolean isAcessorio() {
        return acessorio;
    }


    public void setAcessorio(boolean acessorio) {
        this.acessorio = acessorio;
    }


    public float getMana() {
        return mana;
    }


    public void setMana(float mana) {
        this.mana = mana;
    }


    public String getMagia() {
        return magia;
    }


    public void setMagia(String magia) {
        this.magia = magia;
    }


    public int getFeiticos() {
        return feiticos;
    }


    public void setFeiticos(int feiticos) {
        this.feiticos = feiticos;
    }


    public float getForca() {
        return forca;
    }


    public void setForca(float forca) {
        this.forca = forca;
    }


}
