package fr.dampierre;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {

        demanderEtAfficherNotes();


    }
    public static void demanderEtAfficherNotes() {
        Scanner in = new Scanner(System.in);
        System.out.print("NB de notes a entrer ?" );
        while (!in.hasNextInt()){
            in.next();
            System.out.println("Ce n'est pas un entier. Essayez encore.");
            System.out.println("entrez le nombre de notes");
        }
        int nbnote = in.nextInt(); 
        System.out.println(nbnote);

        int[] compteurs=new int[nbnote];

        for (int i=0; i<nbnote ;i++){
            System.out.print("entrer note "+ i +" : ");
            int note = in.nextInt();
            compteurs[i]= note;
         }
         System.out.println(Arrays.toString(compteurs));
        


    }
}

