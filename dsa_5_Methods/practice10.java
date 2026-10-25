package dsa_5_Methods;
import java.util.Scanner;
public class practice10 {
    public static void main(String[] args) {
        sum();
        product();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter 2 numbers: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum is: " + c);
        sc.close();
    }
    static void product(){
      int d = 3*2;
      System.out.println("The product is: " + d);
    }
}
