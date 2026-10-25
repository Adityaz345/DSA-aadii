package dsa_3_Loops;
import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.println(n + " is a composite number.");
                break;
            }
        }
    }
    
}
