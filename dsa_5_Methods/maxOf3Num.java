package dsa_5_Methods;
import java.util.Scanner;

public class maxOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        sc.close();

        //System.out.println(Math.max(a, Math.max(b, c))); max of 3 numbers using built in method

         int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Maximum number is : " + max);
    }
    
}
