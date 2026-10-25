package dsa_5_Methods;

public class Practice11 {
    // Armstrong number 

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += rem*rem*rem;
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
    
}
