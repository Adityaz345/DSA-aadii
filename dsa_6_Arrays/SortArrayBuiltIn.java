package dsa_6_Arrays;
//import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
    //     int [] arr = {5, 4, 3, 2, 1};
    //     print(arr);
    //     Arrays.sort(arr);
    //     print(arr); 
    // }

    //     public static void print (int [] arr){
    //         for (int i = 0; i<arr.length; i++){
    //             System.out.print(arr[i] + " ");
    //         }
    //         System.out.println();
    //     }


        int [] arr = {5, 4, 3, 2};
        for (int i = 0; i<arr.length; i++){
            if (i % 2 == 0) {
                arr [i] = arr[i] + 10; // if index is even, add 10 to the element
            }
            else {
                arr [i] = arr[i] * 2; // if index is odd, multiply the element by 2
            }
            //System.out.print(arr.length + " ");
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
           
            
    }
}
        
    
    

