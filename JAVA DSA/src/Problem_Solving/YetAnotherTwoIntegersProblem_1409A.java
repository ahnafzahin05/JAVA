package Problem_Solving;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            int ans = (int) Math.ceil(Math.abs((b-a)/10.0));
            System.out.println(ans);
        }
    }
}
