package dsa_6_Arrays;
import java.util.Scanner;
public class zPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];
        
        //input 
        //rows 

        for (int i=0; i<row; i++){
            //cols
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
sc.close();
    }
    
}
