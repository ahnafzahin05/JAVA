package Problem_Solving;

import java.util.Scanner;

public class TurtleAndGoodStrings_2003A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            char c1 = s.charAt(0), c2 = s.charAt(s.length()-1);
            if(c1!=c2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
