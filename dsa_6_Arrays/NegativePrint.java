package dsa_6_Arrays;
import java.util.Scanner;

public class NegativePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // create array
        int [] arr = new int[n];
        System.out.print("Enter the elements of the array: ");


        // input array
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();


        // print negative numbers
        System.out.print("Negative numbers in the array are: ");
        for (int i = 0; i<n; i++){
            if (arr[i] < 0) System.out.print(arr[i] + " ");
        }


    }
    
}
