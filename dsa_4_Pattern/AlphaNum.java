package dsa_4_Pattern;
import java.util.Scanner;

public class AlphaNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Odd rows → Numbers
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            // Even rows → Alphabets
            else {
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
