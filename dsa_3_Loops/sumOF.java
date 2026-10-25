package dsa_3_Loops;
import java.util.Scanner;

public class sumOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.print("Sum of digits: " + sum);

    }
    
}
