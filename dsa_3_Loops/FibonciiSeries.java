package dsa_3_Loops;
import java.util.Scanner;
public class FibonciiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();               
        int a = 0, b = 1;
        int count = 2;

        while (count <= n) {
           int temp = b;
           b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
        sc.close();
    }
    
}
