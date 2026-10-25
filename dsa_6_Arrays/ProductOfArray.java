package dsa_6_Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        // int [] arr = {1, 2, 3, 4, 5};
        // int product = 1;
        // for (int i = 0; i<arr.length; i++){
        //     product *= arr[i];
        // }
        // System.out.println("Product of all elements in the array is: " + product);


        int [] arr = {1,2,-9,-2,5,6};
        int min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Minimum element in the array is: " + min);

    }
    
}
