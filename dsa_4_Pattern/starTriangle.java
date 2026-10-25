package dsa_4_Pattern;
import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // sc.close();
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(  " * ");
        //     }
        //     System.out.println();
        // }

         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(  (char)(i + 64) + " ");
            }
            System.out.println();
        }

    }
    
}
