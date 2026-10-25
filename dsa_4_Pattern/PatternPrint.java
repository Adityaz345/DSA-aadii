package dsa_4_Pattern;
import java.util.Scanner;

public class PatternPrint {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
