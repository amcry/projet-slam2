package fr.dampierre;

public class Losange{
    public static void main(String[] args) {

        //presentation
        System.out.println("Salut tout le monde !");
        jumpUneLignes();

        //losange
        drawLosange();
        jumpUneLignes();

        //croix
        drawCroix();
        jumpUneLignes();

        //fusée
        drawfusée();
        jumpUneLignes();

        //logo IBM
        drawLogoIBM();
        jumpUneLignes();
    }
    public static void drawLosange(){
        drawVInversée();
        drawV();
    }
    public static void drawCroix(){
        drawV();
        drawVInversée();
    }
    public static void drawfusée(){
        drawVInversée();
        drawCarré();
        System.out.println(" | JAVA |");
        drawCarré();
        drawVInversée();
    }
    public static void drawLogoIBM(){
        System.out.println(".......  .......    ....    ....");
        System.out.println(".......  ........   .....  .....");
        System.out.println("  ...    ...   ...  ............");
        System.out.println("  ...    ...   ...  ... .... ...");
        System.out.println("  ...    ........   ...  ..  ...");
        System.out.println("  ...    ........   ...      ...");
        System.out.println("  ...    ...   ...  ...      ...");
        System.out.println("  ...    ...   ...  ...      ...");
        System.out.println(".......  ........   ...      ...");
        System.out.println(".......  .......    ...      ...");
    }
    public static void jumpUneLignes(){
        System.out.println("\n"); 
    }
    public static void drawVInversée(){
        System.out.println("    /\\   ");
        System.out.println("   /  \\  ");
        System.out.println("  /    \\ ");
    }
    public static void drawV(){
        System.out.println("  \\    / ");
        System.out.println("   \\  /  ");
        System.out.println("    \\/   ");
    }
    public static void drawCarré(){
        System.out.println(" +------+");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" +------+");
    }
}