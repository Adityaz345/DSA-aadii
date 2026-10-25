package dsa_5_Methods;
import java.util.Scanner;


public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        System.out.println("First Digit: " + firstDigit);
        System.out.println("Last Digit: " + lastDigit);

        sc.close();
    }
}
