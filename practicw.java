//import java.util.Scanner  

class add{
    int TH(int a,int b){
        int c = a + b;
        return c;
    }
}
 
public class practicw {
    public static void main(String[] args) {
        
        add obj = new add();
        int result = obj.TH(10, 20);
        System.out.println("The sum is: " + result);

    }
}