package dsa_6_Arrays;
import java.util.Scanner;



public class xPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [] arr = {10, 20, 30, 40};
        // for (int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // for(int a : arr){
        //     System.out.print(a + " ");
        // }

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // int [] arr = new int[4];
        // for (int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // int arr [] [] = {
        //     {1, 2, 3},
        //     {4, 20, 6} };
        //     for (int i=0; i<arr.length; i++){
        //         for (int j=0; j<arr[i].length; j++){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         System.out.println();
        //     }


        int arr [] []  = new int[3][3];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
sc.close();

    }
}
