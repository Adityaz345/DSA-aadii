package dsa_2_ifElse;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side of triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd side of triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd side of triangle : ");
        int c = sc.nextInt();
        sc.close();

        if(a+b>c && b+c>a && c+a>b) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }


    }
    
}
