package dsa_2_ifElse;
import java.util.Scanner;

public class GoatNum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        sc.close();

        if(a>=b) {
            if(a>=c) {
                System.out.println("The greatest number is : " + a);
            } else {
                System.out.print("The greatest number is : " + c);
            }
        } else {
            if(b>=c) {
                System.out.print("The greatest number is : " + b);
            } else {
                System.out.print("The greatest number is : " + c);
            }
        }
    }
    
}
