package dsa_6_Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        // To find the maximum element in the array
        int [] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum element in the array is: " + max);


        // // To find the minimum element in the array
        // int [] arr = {1, 2, 3, 4, 5};
        // int min = arr[0];
        // for (int i = 1; i>arr.length; i++){
        //     if (arr[i] > min) min = arr[i];
        // }
        // System.out.println("Minimum element in the array is: " + min);
    }
}
 