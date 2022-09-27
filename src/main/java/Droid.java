public class Droid extends Personagem {

    private boolean hostil;

    public Droid(int cont, String nome, int id, int poder) {
        super(cont, nome, id, poder);
    }


    public void hackearSistema() {
        System.out.println("Nome: " + getNome() + "hackeou o sistema da nave ");

    }

    public void travarBatalha() {
        if (hostil) {
            System.out.println("Nome: " + getNome() + " travou uma batalha contra um jedi ");
        } else {
            System.out.println("Nome: " + getNome() + " travou uma batalha contra um sith ");
            setPoder(getPoder() + 1);
        }


    }
}
