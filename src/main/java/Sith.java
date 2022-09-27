public class Sith extends Personagem implements Força {

    private boolean darth;
    private Sabre sabre;

    public Sith(int cont, String nome, int id, int poder) {
        super(cont, nome, id, poder);
    }

    @Override
    public void mostraInfo() {

    }


    public void corromperJedi() {
        if (darth && getPoder() > 60) {
            System.out.println("Nome:" + getNome() + " levou um jedi para o lado negro da força ");
        } else {
            System.out.println("Nome:" + getNome() + " ainda não consegue corromper jedis ");
        }


    }


    @Override
    public void usarForca() {
        System.out.println("Sith: " + getNome() + " usou o lado negro da forca ");
        setPoder(getPoder() + 3);

    }

    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);

    }

    public void travarBatalha() {
        System.out.println("Nome: " + getNome() + " travou uma batalha contra um jedi ");
        setPoder(getPoder() + 1);

    }
}
