public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos

        Jedi jedi = new Jedi(5, "ze", 1000, 100);
        Sith sith = new Sith(10, "Leticia", 1000, 200);
        Droid droid = new Droid(30, "armando", 2000, 700);


        Personagem[] personagens = new Personagem[5];

        personagens[0] = jedi;
        personagens[1] = sith;
        personagens[2] = droid;
        //Nave nave = new Nave("taixigi",true,personagens  )

        // Varrendo o vetor para verificar se os comportamentos estão corretos
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] != null) {
                if (personagens[i] instanceof Jedi) { // Verifica se está apontando para um objeto do tipo Jedi
                    Jedi j = (Jedi) personagens[i];
                    j.mostraInfo();
                    j.usarForca();
                    j.travarBatalha();
                    j.treinarPadawan();
                    //j.trocarSabre();
                    System.out.println();
                } else if (personagens[i] instanceof Sith) { // Verifica se está apontando para um objeto do tipo Sith
                    Sith s = (Sith) personagens[i];
                    s.mostraInfo();
                    s.mostraInfo();
                    s.usarForca();
                    s.travarBatalha();
                    s.corromperJedi();
                    System.out.println();
                } else if (personagens[i] instanceof Droid) { // Verifica se está apontando para um objeto do tipo Droid
                    Droid d = (Droid) personagens[i];
                    d.mostraInfo();
                    d.hackearSistema();
                    d.travarBatalha();
                }
            }
        }
    }
}
