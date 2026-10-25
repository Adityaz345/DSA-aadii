package dsa_6_Arrays;

public class SearchLinearOfArray {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        int target = 6;
        boolean found = false; // false means target array me nahe hai
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                found = true; // true means target array me hai
                break;
            }
        }
        if (found){
            System.out.println("Target found in the array");
        }
        else {
            System.out.println("Target not found in the array");
        }
    }
}
