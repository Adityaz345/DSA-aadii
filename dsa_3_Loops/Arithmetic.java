package dsa_3_Loops;
import java.util.Scanner;
public class Arithmetic {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 99, d = 4;
    for (int i = n; i >= 1; --i) {
        System.out.print(a + " ");
        a -= d;

    }
sc.close();


}
    
}
