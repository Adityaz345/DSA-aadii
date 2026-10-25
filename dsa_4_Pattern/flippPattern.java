package dsa_4_Pattern;
import java.util.Scanner;

public class flippPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        //  for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

       
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n+1-i; j++) {
        //         System.out.print(j  + " ");
        //     }
        //     System.out.println();
        // }

        //  for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n+1-i; j++) {
        //         System.out.print((char)(j+96) + " ");
        //     }
        //     System.out.println();

        //     for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n+1-i; j++) {
        //         System.out.print((char)(i+64) + " ");
        //     }
        //     System.out.println();
        // }

         for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) 
                if(i%2!=0) {
                    System.out.print(j );
                } else {
                    System.out.print((char)(j+64));
                }
            System.out.println();
        }
    }
    
}
