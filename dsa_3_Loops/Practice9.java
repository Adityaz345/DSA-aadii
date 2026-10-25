package dsa_3_Loops;
import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fruit = sc.nextLine();

        // if (Fruit.equals("Mango")) {
        //     System.out.println("King of Fruits");
        // } 
        // if (Fruit.equals("Apple")) {
        //     System.out.println("A sweet red fruit");
        // }
         sc.close();

        switch (Fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }    

}