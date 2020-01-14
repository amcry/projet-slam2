package fr.dampierre;


public class Paramètre{
    public static void main(String[] args) {
    
    int nb=15;
    afficherSequence(nb); 
    System.out.println(); 
    afficherTableau(3,5);
    System.out.println();

    }
    public static void afficherSequence(int nb) {
        for (int i=1; i<=nb;i++){
            System.out.print("[" + i + "] ");
        }
    }
    public static void afficherTableau( int ligne, int colonne) {
        int compteur=1;
        for (int i = 1; i <=ligne; i++) {
            for (int j = 1; j <= colonne; j++) {
                System.out.print(compteur + " " );
                compteur++;
            }


            System.out.println();
        }
            
    }
    
    
        
}


