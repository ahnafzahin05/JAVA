package Class_11_Recursion;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0) return 1;
//        int ans = n*fact(n-1);
//        return ans;
        return n*fact(n-1);
        //return (n==0) ? 1: n*fact(n-1);
    }
}
