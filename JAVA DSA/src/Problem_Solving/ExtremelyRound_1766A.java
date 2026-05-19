package Problem_Solving;

import java.util.Scanner;

public class ExtremelyRound_1766A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = (int)Math.log10(n) + 1;
            int ans = (int) (9*(count-1) + n/Math.pow(10, count-1));
            System.out.println(ans);
        }
    }
}
