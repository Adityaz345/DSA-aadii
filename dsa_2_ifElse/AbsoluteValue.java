package dsa_2_ifElse;
import java.util.Scanner;

public class AbsoluteValue { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // if(n<0) {
        //     n = -n;
        // }
        // System.out.println(n);
        if(n > 0) {
            System.out.println("Absolute value is : " + n);
        } else {
            System.out.println("Absolute value is : " + (-n));
        }
        sc.close();
    }
    
}
