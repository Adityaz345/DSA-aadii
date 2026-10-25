package dsa_2_ifElse;
import java .util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();

        if(n%5==0 && n%3==0) {
            System.out.println("apurva");
            
        }
        
        else if(n%5 == 0) {
            System.out.println("riya");
        } 
        else if(n%3 == 0) {
            System.out.println("banu");
        } 
        else if(n%5!=0 && n%3!=0) {
          System.out.println("isha");
        }

        // if(n%5 == 0 || n%3 == 0) {
        //     System.out.println("then it is divisible by 5 or 3");
        // } 
        //     else {
        //        System.out.println("then it is not divisible by 5 or 3");
        //     }
    }
}
