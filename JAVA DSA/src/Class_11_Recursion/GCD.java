package Class_11_Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        //System.out.println(ForLoop(a,b));
        System.out.println(gcdRecursively(a,b));
    }

    public static int gcdRecursively(int a, int b){
        if(a==0) return b;
        return gcdRecursively(b%a,a);
    }
    public static int ForLoop(int a, int b){
        for(int i=Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
}
