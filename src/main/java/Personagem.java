public abstract class Personagem {

    public int cont;
    private String nome;
    private int id;
    private int poder;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public Personagem(int cont, String nome, int id, int poder) {
        this.cont = cont;
        this.nome = nome;
        this.id = id;
        this.poder = poder;
    }

    public void mostraInfo() {

    }

    public abstract void travarBatalha();
}
