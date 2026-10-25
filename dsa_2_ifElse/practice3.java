package dsa_2_ifElse;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        double n = sc.nextDouble();
        int n1 = (int) n;;
        if (n == n1) {
            System.out.println("Integer");
        } else {
            System.out.println("Not an Integer");
        }
        sc.close();
    }
    
}
