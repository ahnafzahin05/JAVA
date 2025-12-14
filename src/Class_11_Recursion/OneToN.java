package Class_11_Recursion;

import java.util.Scanner;

public class OneToN {
    static int n; //upto which we wanna print

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //printUsingGlobalVar(1);
        //print(1,5);
        magic(n);
    }

    public static void magic(int n){
        if(n==0) return;
        magic(n-1);
        System.out.print(n+" ");
    }
    public static void print(int x, int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }

    public static void printUsingGlobalVar(int x){
        if(x>n) return;
        System.out.println(x);
        printUsingGlobalVar(x+1);
    }
}
