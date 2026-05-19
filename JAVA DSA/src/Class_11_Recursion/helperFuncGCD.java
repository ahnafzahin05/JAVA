package Class_11_Recursion;

public class helperFuncGCD {
    public static void main(String[] args) {
        int a = 60, b = 25;
        System.out.println(gcd(a,b));
    }

    public static int helper(int a, int b){
        //inside helper func we'll write the main code assuming all the parameters are given correctly
        if(a==0) return b;
        return helper(b%a, a);
    }

    public static int gcd(int a, int b){
        //we'll pass the arguments in correct form from here
        return helper(Math.min(a,b),Math.max(a,b));
    }
}
