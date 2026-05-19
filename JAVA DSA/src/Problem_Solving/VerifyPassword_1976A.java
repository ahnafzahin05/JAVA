package Problem_Solving;

import java.util.Scanner;

public class VerifyPassword_1976A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = true;
            for(int i=0; i<n-1; i++){
                if(s.charAt(i)<=s.charAt(i+1)) flag = true;
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
