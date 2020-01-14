package fr.dampierre;


public class Return{
    public static void main(String[] args) {
        //int minimum = min(2, -3, 13);
        //System.out.println(min(2, -3, 13));
        //System.out.println(paie(6,5));
        //System.out.println(paie(20,7));
        System.out.println(pieceDe20(1.20));
    }

    public static int min(int nb1, int nb2, int nb3){
        //int plusPetitDesDeuxPremiers = Math.min(nb1,nb2);   
        //int plusPetitDesTrois = Math.min(plusPetitDesDeuxPremiers, nb3);
        //return plusPetitDesTrois;
        return Math.min(Math.min(nb1,nb2),nb3);
    }   

    public static double paie(int salaireHoraire, int heures) {
        double salaire = 0;
        int heuresNormales = Math.min(heures , 8);
        int heureSup = heures - heuresNormales;

        salaire = heuresNormales * salaireHoraire + heureSup * (salaireHoraire * 1.5);

        return salaire;
    }
    public static int pieceDe20( double euro) {
        
        return (int) (euro / 0.20);
    }
    
}