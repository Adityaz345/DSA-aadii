package dsa_3_Loops;
import java.util.Scanner;
public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        sc.close(); 

        while (n != 0) {
            n = n / 10; // Remove the last digit
            count++; // Increment the count
        }
        System.out.println("Number of digits: " + count);

        
    }
    
}
