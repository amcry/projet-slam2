package fr.dampierre;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        int victoireG1 = 0;
        int victoireG2 = 0;
        for (int i = 0; i < 1; i++) {

            Guerrier g1 = new Guerrier();
            g1.init("Lucas", 100.0, 10, 100);
            Guerrier g2 = new Guerrier();
            g2.init("Ambroise", 20.0, 50, 100);

            while (g1.estEnVie() && g2.estEnVie()) {
                g1.attaquer(g2);

                // System.out.println(g1.getPv()+" "+g2.getPv());
            }
            if (g1.estEnVie()) {
                victoireG1++;
            } else {
                victoireG2++;
            }

            // g1.afficherPv();
            // g2.afficherPv();
            // System.out.println();

        }
        System.out.println("victoire de Lucas = " + victoireG1 + " victoire d'Ambroise= " + victoireG2);

    }
}
