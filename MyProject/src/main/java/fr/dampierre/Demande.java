package fr.dampierre;

import java.util.Scanner;
public class Demande{
    public static void main(String[] args) {
        //demanderEtAfficherDouble();
       // int res= demanderDeuxEntier();
       // System.out.println("somme= " +res);
      //String res= perroquet(10);
      //System.out.println(res);
      //surfaceDeCercle();
       // vertical("Salut");
       
        System.out.println(formaterNom("ambroise", "bultez"));


    }
    public static void demanderEtAfficherDouble(){
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("entrez un entier : ");
        int entrée = console.nextInt();
        System.out.println("Double : " +entrée * 2);
    }
    public static int demanderDeuxEntier(){
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("entrez une limite basse :");
        int basse = console.nextInt();
        System.out.print("entrez une limite basse :");
        int haute = console.nextInt();
        return somme(basse,haute);
    }
    
    private static int somme(int basse, int haute){
        int sommeEntier=0; 
         for(int i = basse; i <= haute; i++) {
            sommeEntier +=i; 
        }
        return sommeEntier;
    }



    public static String perroquet(int nbRepetitions) {
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("Bonjour, je suis Coco. On m'a demandé de répéter un truc 300 fois. Entrez une phrase svp : ");
        String encore = console.nextLine();

        String res ="";

        for (int i = 1; i <=nbRepetitions; i++) {
            res = res + encore + "\n";
        }
        return res;
    }


    public static void surfaceDeCercle() {
        double rayon = demanderRayon();
        double surface =calcul(rayon);
        System.out.println("la surface du cercle de rayon "+ rayon + " est "+ surface);
        
    }

    public static double demanderRayon() {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez le rayon : ");
        return in.nextDouble();

    }

    public static double calcul(double rayon) {
        double surface;
        return Math.PI * (rayon*rayon);
    }

    //public static double demanderDouble(String message) {      methode generique qui marche pour d'autre exercise
    //    Scanner in = new Scanner(System.in);
    //    System.out.print(message);
    //    double entrée = in.nextDouble();
    //    return entrée;
   
    public static void vertical(String msg){

        for (int i = 0; i <msg.length(); i++) {
           System.out.println(msg.charAt(i));
        }
    
    }

    public static String inverse(String s){
        String res ="";
        for (int i = s.length()-1; i >= 0; i--) {
            res =res + s.charAt(i);
        }
        return res;
    }

    public static String demanderEtFormaterNom(){
        
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("Entrez votre prénom et votre nom: ");
        String prenom = console.next();
        String nom = console.next();
        String nomMaj = nom.toUpperCase();

        String res = nomMaj + ", " + prenom;
        
        return res;
        
    }


    public static String formaterNom(String prenom, String nom){
        
        String nomMaj = nom.toUpperCase();

        String resu = nomMaj + ", " + prenom;
        
        return resu;
        
    }
    
     
    
    

}