package dsa_4_Pattern;
import java.util.Scanner;
public class SXNumSqu2 {
   public static void main(String[] args) {
      //    Scanner sc = new Scanner (System.in);
      //   int n = sc.nextInt();
      //   sc.close();
      //   for(int i=1; i<=n; i++) {
      //       for(int j=1; j<=n; j++) {
      //           System.out.print(i  + " ");
      //       }
      //       System.out.println();
      //   }

      Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }

    
   } 

}
