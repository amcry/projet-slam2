package fr.dampierre;

public class suite{
    public static void main(String[] args) {
        
     motif4();
     System.out.println(" ");
     motif5();
     System.out.println(" ");
     motif6();
     System.out.println(" ");
     motif7();
    }

    public static void suite1() {
            for (int i=-4; i<=86; i +=18){
                 System.out.print(i+ " ");
        } 
    }

    public static void suite2() {
        int n1 = 0, n2 = 1, n3; 
            System.out.print(n1 +" "+ n2);
        for (int i = 0; i < 15; i++) {
                    n3= n2 + n1; 
            System.out.print(" "+ n3); 
                    n1 = n2 ; 
                    n2 = n3; 
            }     
        }

    public static void suite3() {
        int s=0;     
        for (int i=1; i<=10; i++){
            s=  i * i;
            System.out.print(s+" ");
        }
        System.out.println(" "); 
    }




    public static void motif1() {
        for (int i=1;i<=40; i++){
            System.out.print("-");
        }
        System.out.println("");
        for (int i=1;i<=10; i++){
            System.out.print("_-^-");
        }
        System.out.println("");
        System.out.print("00");
        for (int i=1;i<=9; i++){
            System.out.print(i);
            System.out.print(i);
        }
        System.out.print("00");
        for (int i=1;i<=9; i++){
            System.out.print(i);
            System.out.print(i);
        }
        System.out.println("");
        for (int i=1;i<=40; i++){
            System.out.print("-");
        }

    }
    public static void motif2() {
        for (int i=1;i<=5; i++){
            for (int j=1;j<=5; j++){
            System.out.print("*");

            }
        System.out.println(" ");
        }
    }
    public static void motif3() {
        for (int i=1;i<=5; i++){
            for (int j=1;j<=i; j++){
            System.out.print("*");
            }
        System.out.println(" ");
        }
    }        
    public static void motif4() {
        for (int i=1;i<=6; i++){
            for (int j=1;j<=i; j++){
                System.out.print(i); 
            }
        System.out.println(" ");
        }
    }
    public static void motif5() {
        for (int i=1;i<=5; i++){
            for (int j=5;j>=i; j--){
                System.out.print(" "); 
                
            }
        System.out.println(i);
        }
    }
    public static void motif6() {
        for (int i=1;i<=5; i++){
            for (int j=4;j>=i; j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void motif7() {
        for (int i=1; i<=3; i++){
            System.out.print("00");
            for(int j=000; j<=999; j+=111){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}  
