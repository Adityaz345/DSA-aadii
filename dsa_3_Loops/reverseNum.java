package dsa_3_Loops;
import java.util.Scanner;
public class reverseNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number: " + reversed);
        

    }
}
