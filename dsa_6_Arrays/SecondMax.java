package dsa_6_Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE; // -infinity
        int secondMax = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > secondMax && arr[i] < max) secondMax = arr[i];
        }
       System.out.println(max);
         System.out.println(secondMax);
    }
    
}
