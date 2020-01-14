package fr.dampierre;


public class Pythagor{
    public static void main(String[] args) {

        double hypo1 = hypotenuse(5,12);
        System.out.println("Hypotenuse 1 = "+ hypo1);
        double hypo2= hypotenuse(3,4);
        System.out.println("Hypotenuse 2 = "+ hypo2);
    }


        public static double hypotenuse(double a, double b) {
            double c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
            return c;  
        }
        
            
            
        }
