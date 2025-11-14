package Problem_Solving;

import java.util.Scanner;

public class MinRotationsToUnlockACircularLock_Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String d = sc.next();
        int ops = 0;
        int n = r.length();
        for(int i=0; i<n; i++){
            int w1 = Math.abs(r.charAt(i) - d.charAt(i));
            int w2 = 10 - w1;
            ops+= Math.min(w1,w2);
        }
        System.out.println(ops);
    }
}
