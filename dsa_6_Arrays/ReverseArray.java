package dsa_6_Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int i = 0; // starting index
        int j = n - 1; // ending index

        while (i < j){
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr){
            System.out.print(k + " ");
        }
    }
}
