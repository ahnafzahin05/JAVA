package Class_11_Recursion;

import java.util.Scanner;

public class IncreDecre {
    //5 4 3 2 1 1 2 3 4 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return; //base case
        if(n>1) System.out.println(n); //work //cond if(n>1) if we wanna print '1' only for 1 time
        print(n-1); //call
        System.out.println(n); //work
    }
}
