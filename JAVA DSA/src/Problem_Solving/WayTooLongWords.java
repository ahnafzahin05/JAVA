package Problem_Solving;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t=1; t<=n; t++){
            String s = sc.next();
            int l = s.length();
            if(l>10) {
                System.out.println(s.charAt(0)+""+(l-2)+s.charAt(l-1));
//                System.out.printNto1(s.charAt(0));
//                System.out.printNto1(l-2);
//                System.out.println(s.charAt(l-1));
            }
            else System.out.println(s);
        }
    }
}
