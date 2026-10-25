package dsa_3_Loops;
import java.util.Scanner;

public class tableLoop {
    public static void main(String[] args) {
        
        // for (int i = 17; i <=170; i++) {
        //     if (i % 17 == 0) {
        //         System.out.print(i + " ");
        //     }


        // for (int i = 1; i <= 10; i++) {
        //     System.out.print(17 * i); 
        // }


        // for (int i = 17; i <= 170; i= i+17) {
        //     System.out.print( i + " ");
        // }

        // reverse order

        // for (int i = 170; i >= 17; --i) {
        //     System.out.print( i + " ");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = n; i >= 1; --i) {
            System.out.print( i + " ");
        }
    
}
}
