package dsa_2_ifElse;
import java.util.Scanner;

public class proftLoss {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price : ");
        int sp = sc.nextInt(); // selling price
        System.out.print("Enter the cost price : ");
        int cp = sc.nextInt(); // cost price

        if(sp>cp) System.out.println("profit : " + (sp-cp) + " profit percentage : " + ((sp-cp)*100/cp) + "%");
        if(sp==cp) System.out.println("no profit no loss");
        if(sp<cp) System.out.println("loss : " + (cp-sp) + " loss percentage : " + ((cp-sp)*100/cp) + "%");
        sc.close();
    }
}
