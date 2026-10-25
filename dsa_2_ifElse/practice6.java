package dsa_2_ifElse;
import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int n2 = sc.nextInt();


        if (n1>n2){
            System.out.println("Number1 is greater than Number2" + n1);
        }
        else {
            System.out.println("Number2 is greater than Number1" + n2);
        }
        sc.close();
    }
}
