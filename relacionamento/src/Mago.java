public class Mago implements IMago {
    private String nome;
    private float vida;
    private boolean grimorio;
    private boolean acessorio;
    private float mana;
    private String magia;
    private int feiticos;
    private float forca;
    private String ataqueComum;
    private String defesa;
    private String especial;

    public Mago(float vida, float mana, String magia, int feiticos, float forca, boolean grimorio, boolean acessorio) {
        this.vida = vida;
        this.mana = mana;
        this.magia = magia;
        this.feiticos = feiticos;
        this.forca = forca;
        this.grimorio = grimorio;
        this.acessorio = acessorio;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getVida() { return vida; }
    public void setVida(float vida) { this.vida = vida; }

    public boolean isGrimorio() { return grimorio; }
    public void setGrimorio(boolean grimorio) { this.grimorio = grimorio; }

    public boolean isAcessorio() { return acessorio; }
    public void setAcessorio(boolean acessorio) { this.acessorio = acessorio; }

    public float getMana() { return mana; }
    public void setMana(float mana) { this.mana = mana; }

    public String getMagia() { return magia; }
    public void setMagia(String magia) { this.magia = magia; }

    public int getFeiticos() { return feiticos; }
    public void setFeiticos(int feiticos) { this.feiticos = feiticos; }

    public float getForca() { return forca; }
    public void setForca(float forca) { this.forca = forca; }

    public String getAtaqueComum() { return ataqueComum; }
    public void setAtaqueComum(String ataqueComum) { this.ataqueComum = ataqueComum; }

    public String getDefesa() { return defesa; }
    public void setDefesa(String defesa) { this.defesa = defesa; }

    public String getEspecial() { return especial; }
    public void setEspecial(String especial) { this.especial = especial; }
}
