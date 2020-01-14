package fr.dampierre;

public class Exercice{
    public static void main(String[] args) {
        
        b();


    }








    public static void zarbi() {
        int nb = 4;
        for (int i = 1; i <= nb; i++) {
          System.out.println(nb);
          nb /= 2;
        }   
    }
    public static void chiffre(){
        int total = 25;
        for (int nb = 1; nb <= (total / 2); nb++) {
        total -= nb;
        System.out.println(total + " " + nb);
        }
    }
    public static void a() {
        for (int i = 1; i <= 3; i++){
            System.out.println(i * 2);
            System.out.print("ligne suivante: ");
        }   
    }
   public static void go() {
    System.out.println("Go moins ");
    for (int i = 5; i >= 1; i--) {
      System.out.println(i + ", ");
    }
    System.out.println("GO !");    
   }
   public static void b() {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 10; j++) {
          System.out.print((i * j) + " ");
        }
        System.out.println();
      }
   }
   public static void c() {
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 10 - i; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
   }
   public static void d() {
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 3; j++) {
          for (int k = 1; k <= 4; k++) {
            System.out.print("*");
          }
          System.out.print("!");
        }
        System.out.println();
      }
   }
   public static void e() {
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 3; j++) {
          for (int k = 1; k <= 4; k++) {
            System.out.print("*");
          }
        }
        System.out.print("!");
        System.out.println();
      }
   }
   public static void f() {
    for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 3; j++) {
          for (int k = 1; k <= 4; k++) {
            System.out.print("*");
            System.out.print("!");
          }
          System.out.println();
        }
      }
   }
}
    