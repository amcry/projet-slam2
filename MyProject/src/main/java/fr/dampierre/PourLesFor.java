package fr.dampierre;

public class PourLesFor {
    public static void main(String[] args) {

         drawLine();

         System.out.println();

         drawSmiley();

         System.out.println();

         showNumber();
         showNumber();

         System.out.println();

         drawLine();
        }
    
    public static void drawLine(){
        for(int i=1 ; i<=40; i++){
            System.out.print("-");
        }
    }
    public static void showNumber(){
        for (int i = 1; i <=9; i++) {
            System.out.print(i); 
            System.out.print(i);
        }
        System.out.print("00");
    }
    public static void drawSmiley(){
        for (int i = 1; i <=10; i++) {
        System.out.print("_-^-");
        }
    }

}
