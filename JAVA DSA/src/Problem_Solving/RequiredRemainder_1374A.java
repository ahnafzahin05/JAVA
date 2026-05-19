package Problem_Solving;

import java.util.Scanner;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int maxMultiple = n/x;
            if((maxMultiple *x + y)<=n) System.out.println(maxMultiple *x + y);
            else System.out.println((maxMultiple -1)*x + y);
        }
    }
}
