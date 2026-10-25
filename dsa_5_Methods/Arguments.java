package dsa_5_Methods;

public class Arguments {
    // public static void sum(int a, int b) {      /* parameters */
    //     System.out.println("The sum is: " + (a + b));
    // }
    // public static void max(int a, int b) {      /* parameters */
    //     System.out.println((a + b));
    // }
    // public static void main(String[] args) {
    //     sum(5, 10);     /* arguments */
    //     max(5, 120);     /* arguments */
        
    // }


    public static void max(int a, int b , int c) {      /* parameters */
        if(a>=b && a>=c)
            System.out.println(a);
        else if(b>=a && b>=c)
            System.out.println(b);
        else
            System.out.println(c);
    }
    public static void main(String[] args) {
        max(5, 10, 15);     /* arguments */
    }

    
}

