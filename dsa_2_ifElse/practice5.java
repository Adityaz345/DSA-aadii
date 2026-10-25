package dsa_2_ifElse;
import java.util.Scanner;
public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();
        System.out.print("Enter the time in years: ");
        int time = sc.nextInt();

        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest: " + simpleInterest);
        sc.close();
    }

}
