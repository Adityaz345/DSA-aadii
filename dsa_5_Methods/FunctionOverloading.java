package dsa_5_Methods;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(10);
        fun("Aditya");
        
    }
        static void fun(int x ){
            System.out.println(x);
        }
        static void fun(String name){
            System.out.println(name);
        }
}
