package Class_11_Recursion;

import java.util.Scanner;

public class NthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NoOfWays(n));
    }

    public static int NoOfWays(int n){
        if(n==1 || n==2) return n;
        return NoOfWays(n-1) + NoOfWays(n-2);
    }
}
