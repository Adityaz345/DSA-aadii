package dsa_2_ifElse;
import java .util.Scanner;

public class FourDigitNum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();

       if(n>999 && n<10000)
         {
          System.out.println(n+" is a Four digit number");
         } else {
          System.out.println(n+" is not a four digit number");
         }

    }
    
}
