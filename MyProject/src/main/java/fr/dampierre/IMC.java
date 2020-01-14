package fr.dampierre;

public class IMC{
    public static void main(String[] args){

        double poids = 68.0;
        System.out.println("poids :" + (poids));

        double taille = 1.85;
        System.out.println("taille :" + (taille));

        double imc = (poids / (taille*taille) );
        System.out.println("IMC :" +(imc));


    }
}