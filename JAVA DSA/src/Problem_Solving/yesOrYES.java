package Problem_Solving;

import java.util.Scanner;

public class yesOrYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            String s = sc.next();
            if((s.charAt(0)=='y' || s.charAt(0)=='Y') && (s.charAt(1)=='e' || s.charAt(1)=='E') && (s.charAt(2)=='s' || s.charAt(2)=='S'))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}