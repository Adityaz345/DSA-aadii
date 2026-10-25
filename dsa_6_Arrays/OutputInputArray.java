package dsa_6_Arrays;
import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // output array
        // int [] arr = {1, 2, 3, 4, 5};
        //  for (int i = 0; i<5; i++){
        //     System.out.print(arr[i] + " ");
    // }




    // int [] arr = {1, 2, 3, 4, 5,98, 76, 54, 32, 10};
    // for (int i = 0; i<arr.length; i++){
    //     System.out.print(arr[i] + " ");
    // }
    
    // input array
    // default value of int array is 0
    int [] arr = new int[5];
    // for (int i = 0; i<5; i++){
    //     System.out.print(arr[i]);}


    // input array
    for (int i = 0; i<5; i++){
        arr[i] = sc.nextInt();
        
    }
    sc.close();

    // print array
    for (int i = 0; i<5; i++){
        System.out.print(arr[i]*2 + " ");
    }



    
}
}
