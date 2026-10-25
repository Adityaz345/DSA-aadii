package dsa_6_Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {

        // // sum of array
        // int [] arr = {1, 2, 3, 4, 5};
        // int sum = 0;
        // for (int i = 0; i<arr.length; i++){
        //     sum += arr[i];
        // }
        // System.out.println("Sum of the array is: " + sum);


        // // sum of array with user input
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        sc.close();
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of the array is: " + sum);
    }
    
}
