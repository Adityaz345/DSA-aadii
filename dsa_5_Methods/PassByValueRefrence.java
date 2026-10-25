package dsa_5_Methods;

import java.util.Arrays;

public class PassByValueRefrence {
    // public static void change(int x){
    //     x = 1;
    //     System.out.println(x);
    // }
    // public static void main(String[] args) {
    //     int x = 5;
    //     System.out.println(x);
    //     change(x);
    //     System.out.println(x);
    // }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        
        //System.out.println(arr[0]+" "+arr[1]);

        // for (int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
    static void change(int[] arr){
        arr[0] = 99;
        arr[1] = 88;
    }
    
}
