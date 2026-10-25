package dsa_4_Pattern;
import java.util.Scanner;
public class StarSquare {

    public static void main(String[] args) {

        //for star 

        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // sc.close();
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //for numbers

        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // sc.close();
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         System.out.print(j  + " ");
        //     }
        //     System.out.println();
        // }

        //for letters ascii capital letters

        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // sc.close();
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         System.out.print((char)(j + 64) + " ");
        //     }
        //     System.out.println();
        // }

        // for ascii small letters

         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }
    }
    
}
