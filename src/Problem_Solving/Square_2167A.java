package Problem_Solving;

import java.util.Scanner;

public class Square_2167A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a==b && a==c && a==d) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
