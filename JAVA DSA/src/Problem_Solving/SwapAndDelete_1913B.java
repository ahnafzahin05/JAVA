package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAndDelete_1913B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();

            int zero = 0;
            for(int i=0; i<n; i++) if(s.charAt(i)=='0') zero++;
            int one = n - zero;

            int ops = Math.abs((zero-one));
            int min = Math.min(zero,one);

        }
    }

}
