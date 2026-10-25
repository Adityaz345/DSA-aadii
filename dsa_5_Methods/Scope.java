package dsa_5_Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Aditya";
        {
            //int a = 100; // not allowed
            a = 100; // allowed
            int c = 99; // allowed
            System.out.println(c);
            name = "Sakhu";
            System.out.println(name);
        }
        //System.out.println(c); // not allowed
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        
    }
    
}
