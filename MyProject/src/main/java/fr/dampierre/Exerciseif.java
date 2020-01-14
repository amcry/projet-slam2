package fr.dampierre;

import java.util.Scanner;
public class Exerciseif{
    public static void main(String[] args) {
        
      System.out.println(couleur());


    }
  public static void demande() {
    Scanner console;
    console = new Scanner(System.in);
    System.out.print("Combien va dépenser Fred ?" );
    int montant = console.nextInt();
    System.out.println("Cathy aura besoin de " + nbBillets1(montant) + " billets de 20.");
    
    
    System.out.print("Combien va dépenser Cathy ? ");
    montant = console.nextInt();
    System.out.println("Fred aura besoin de " + nbBillets1(montant) + " billets de 20.");
    
  }

public static int nbBillets1(int montant) {
    int nbBillets1 = montant / 20;
    
    if (nbBillets1 * 20 < montant) {
        nbBillets1++;
    }
    return nbBillets1;
      
    }

public static String couleur() {
    Scanner console;
    console = new Scanner(System.in);
    System.out.print("Quelle couleur souhaitez-vous ?" );
    String color = console.nextLine().toLowerCase();
    String rouge="r";
    String vert = "v";
    String bleu = "b";
    


    if (color .equals (rouge)){
        return " vous avez choisi le rouge. ";
    }
    else if (color .equals(vert)){
        return " vous avez choisi le vert. ";
    }
    else if (color .equals(bleu)) {
        return" vous avez choisi le bleu. ";
    }
    else{
        return " Connais pas. ";
    }
        
    }


}


    
    
  


