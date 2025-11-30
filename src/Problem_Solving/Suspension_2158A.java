package Problem_Solving;

import java.util.Scanner;

public class Suspension_2158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            int ans = y/2 + r;
            System.out.println(Math.min(ans, n));
        }
    }
}
