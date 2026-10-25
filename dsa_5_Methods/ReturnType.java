package dsa_5_Methods;


public class ReturnType {
    // public static int sakhu(){
    //     System.out.println("hiii");
    //     return 5;
    // }
    public static void main(String[] args) {
        // System.out.println("Welcome to Java");
        // sakhu();
       int sum = max(5,7);
       System.out.println("this is greater" + sum);

    }

   public static int max(int a, int b){
    if (a<b) return a;
    else return b;
   }


    
}
