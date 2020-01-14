package fr.dampierre;

public class Variable{
    public static void main(String[] args){
        //calcule le montant dû, incluant 20% de TVA et 5% de pourboire

        int sousTotal = 38+40+30;
        System.out.println("sous-total : " + (sousTotal));

        double tva = 0.20;
        System.out.println("TVA :" + (sousTotal*tva));

        double pourboire = 0.05;
        System.out.println("Pourboire : " + (sousTotal*pourboire));

        System.out.println("Total : " + (sousTotal + sousTotal*pourboire + sousTotal*tva));
    }

}