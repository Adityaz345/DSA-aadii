package dsa_6_Arrays;
import java.util.Arrays;

public class yPractice {
    public static void main(String[] args) {
        int [] marksss = {180,22,10,-2, 0, 100};
        for (int i = 0; i<marksss.length; i++){
            System.out.println(marksss[i]);
        }
        
        update ();
        update2 ();

        
    }

   static void update (){
    int [] marks = new int[3];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        for (int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
   }

   static void update2 (){
    int [] arr = new int[3];
    arr[0] = 15;
    arr[1] = 95;
    arr[2] = 44;
    for (int i = 0; i<3; i++){
        System.out.println(arr[i]);
    }
    System.out.println("After sorting the array: ");
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
   }
    
}
