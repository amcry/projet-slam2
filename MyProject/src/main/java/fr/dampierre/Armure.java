package fr.dampierre;

public class Armure {
    private int protecCasque = 25;
    private int protecPlastron = 25;
    private int protecjambiere = 25;
    private int protecChaussures = 25;

    public int protection() {
        return protecCasque + protecPlastron + protecjambiere + protecChaussures;
    }

}