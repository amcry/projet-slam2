package fr.dampierre;

import java.util.Random;

public class Guerrier {

    private double force = 20;
    private Armure armure = new Armure();
    private int pv = 100 + armure.protection();
    private int vitesse = 1;
    private String nom;

    public void attaquer(Guerrier autre) {
        Random rand = new Random();
        int puissanceMoi = rand.nextInt((int) force * vitesse);
        int puissanceAutre = rand.nextInt((int) autre.force * autre.vitesse);
        if (puissanceMoi > puissanceAutre) {
            autre.pv = autre.pv - 10;
        } else {
            pv -= 10;
        }
    }

    public boolean estEnVie() {
        return pv > 0;
    }

    // public int getPv(){
    // return pv;
    // }
    public void afficherPv() {
        System.out.print(pv + " " + nom + " ");

    }

    public void init(String name, double force, int vitesse, int armure) {
        nom = name;
        this.force = force;
        this.vitesse = vitesse;
        this.armure = armure;
    }

}