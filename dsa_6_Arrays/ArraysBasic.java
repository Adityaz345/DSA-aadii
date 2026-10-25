package dsa_6_Arrays;


public class ArraysBasic {
    public static void main(String[] args) {
    //    int arr1[] = new int[5];
    //    System.out.println(arr1[4] = (int)(Math.random()*100));

        // // update 
        // x[3] = 10;
        // System.out.println(x[3]);

        // int [] x = new int[5];
        // x[0] = 1;
        // x[1] = 2;
        // x[2] = 3;
        // x[3] = 4;
        // x[4] = 5;
        // // System.out.println(x[0]);

        // for (int i = 0; i<x.length; i++){
        //     System.out.println(x[i]);
        // }


 
        int arr[][] = new int[3][3];

         for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}
