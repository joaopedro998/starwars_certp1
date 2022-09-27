public class Nave {
    private String nome;
    private boolean velocidadeLuz;
    Personagem[] personagens = new Personagem[3];

    public Nave(String nome, boolean velocidadeLuz, Personagem[] personagens) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
        this.personagens = personagens;
    }

    public void mostraInfo() {

    }
}
