package dsa_2_ifElse;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate : ");
        int y = sc.nextInt();
        sc.close();

        if (x==0 && y==0) {
            System.out.println("Point is at the origin");
        }
        else if(x>0 && y>0) {
            System.out.println("1st quadrant");
        } 
        else if(x<0 && y>0) {
            System.out.println("2nd quadrant");
        } 
        else if(x<0 && y<0) {
            System.out.println("3rd quadrant");
        } 
        else if(x>0 && y<0) {
            System.out.println("4th quadrant");
        }
 
        else if(x==0) {
            System.out.println("Point is on the y axis");
        }

        else if (y==0) {
            System.out.println("Point is on the x axis");
        }
        
    }
    
}
