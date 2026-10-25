package dsa_2_ifElse;
import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // int max;
        // if(a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }
        // System.out.println("Maximum number is : " + max);

        // int max = (a > b) ? a : b;
        // System.out.println("Maximum number is : " + max);

        // System.out.println( ((a < b) ? a : b));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(((n % 2 == 0) ? "Even number" : "Odd number"));
    }
    
}
