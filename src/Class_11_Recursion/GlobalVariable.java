package Class_11_Recursion;

public class GlobalVariable {
    static int x = 10; //this is a global var, we can change this var value in every possible func in our code
    public static void main(String[] args) {
        //fun();
        x = 5;
        System.out.println(x);
        int x = 2; //if any same name var is declared in a func,
        //then after the declaration everything will be processed in respect to that local var, global var er dam nai ar
        System.out.println(x);
    }
    public static void fun(){
        x = 20;
    }
}
