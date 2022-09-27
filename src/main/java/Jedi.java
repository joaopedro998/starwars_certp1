public class Jedi extends Personagem implements Treinamento, Força {

    private boolean mestre;
    private Sabre sabre;

    public Jedi(int cont, String nome, int id, int poder) {
        super(cont, nome, id, poder);
    }


    @Override
    public void usarForca() {
        System.out.println("Jedi: " + getNome() + " usou a forca para o bem ");
        setPoder(getPoder() + 5);


    }


    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);

    }

    @Override
    public void treinarPadawan() {
        if (mestre || getPoder() > 70) {
            System.out.println("Nome:" + getNome() + " treinou um padawan! ");
        } else {
            System.out.println("Nome:" + getNome() + " ainda nao conseguiu trena o padawan ");
        }

    }


    public void travarBatalha() {
        System.out.println("Nome: " + getNome() + " travou uma batalha contra um sith ");


    }


}
