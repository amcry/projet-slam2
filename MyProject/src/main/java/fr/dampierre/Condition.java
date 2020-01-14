package fr.dampierre;

import java.util.Scanner;
public class Condition{
    public static void main(String[] args) {
       demanderEntierEtAfficherParité(); 

    }


    public static void demanderEntierEtAfficherParité() {
    Scanner console;
    console = new Scanner(System.in);
    System.out.print("entrez un entier : ");
    int nb = console.nextInt();
    if (estPair(nb)) {
        System.out.println(nb + " est pair.");
    }
    else{
        System.out.println(nb+" est impair.");
    }
      } 


public static boolean estPair(int nb) {
    boolean res = true;
    if (nb%2==0){
        res = true;
    }
    else{
         res = false;
    }
    return res;
}
}

