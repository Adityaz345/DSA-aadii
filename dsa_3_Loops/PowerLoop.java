package dsa_3_Loops;
import java.util.Scanner;
public class PowerLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
        sc.close();

        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        System.out.println(power);  
    }
    
}
