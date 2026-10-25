package dsa_6_Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int target = 6;
        boolean flag = false;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }   
        if (flag) {
            System.out.println("Element  found in the array.");
        }
        else {
            System.out.println("Element not found in the array.");
        }
}
}
