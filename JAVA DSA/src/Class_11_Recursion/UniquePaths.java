package Class_11_Recursion;

import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        System.out.println(m1(m,n));
    }

    public static int m1(int m, int n){
        if(m==1 || n==1) return 1;
        return m1(m-1,n) + m1(m,n-1);
    }
}
