package dsa_6_Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int x[] = arr; // Shallow copy
        x[0] = 10;
        System.out.println(arr[0]); // Output: 10 (because x and arr refer to the same array)

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       
    }
    
}
