package dsa_3_Loops;
import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       //System.out.println(ch);

       if (ch >= 'A' && ch <= 'Z') {
           System.out.println("Uppercase");
       }
        else {
            
            System.out.println("Lowercase");
        }


        sc.close();
    }
}
