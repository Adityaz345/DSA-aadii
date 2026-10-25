package dsa_3_Loops;
import java.util.Scanner;

public class BasicsLoop {
    
    public static void main(String[] args) {
        
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("Battery and maushi height vadva");
        // }

        // for (int i = 1; i <= 10; i++) {
        //     System.out.print(i + " ");
        // }

        // int i;
        // for (i = 1; i <= 10; i++) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.print(i);
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        

        


}

}