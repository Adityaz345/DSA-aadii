package dsa_1_basics;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        
        // volume of the sphere
        // double r = 6;
        // double volume = (4/3) * 3.14 * r * r * r;
        //  System.out.println(" the volume of the sphere is : " + volume);

        Scanner sc = new Scanner(System.in);

        // total surface area of the cuboid
        // System.out.print(" enter the length of the cuboid : ");
        // int l = sc.nextInt();
        // System.out.print(" enter the breadth of the cuboid : ");
        // int b = sc.nextInt();
        // System.out.print(" enter the height of the cuboid : ");
        // int h = sc.nextInt();
        // int TSA = 2 * (l*b + b*h + h*l);
        // System.out.println(" the total surface area of the cuboid is : " + TSA);

        // sum of three numbers
        System.out.print(" enter a numbers : ");
        int a = sc.nextInt();
        System.out.print("enter b number : ");
        int b = sc.nextInt();
        System.out.print("enter c number : ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println(" the sum of the three numbers is : " + sum);

        
        sc.close();

    }
    
}
