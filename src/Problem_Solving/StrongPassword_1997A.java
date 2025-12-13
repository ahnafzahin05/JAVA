package Problem_Solving;

import java.util.Scanner;

public class StrongPassword_1997A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            String ans = "";

            if(n>1){
                ans+= s.charAt(0);
                boolean flag = false;
                for(int i=1; i<n; i++){
                    if(s.charAt(i)==s.charAt(i-1) & !flag){
                        ans+= s.charAt(i)=='z'?  (char) (s.charAt(i) -1) : (char) (1+ s.charAt(i));
                        ans+= s.charAt(i);
                        flag = true;
                    }
                    else ans+=s.charAt(i);
                }
                if(!flag) ans+= s.charAt(n-1)=='z'?  (char) (s.charAt(n-1) -1) : (char) (1+ s.charAt(n-1));
            }
            else {
                ans+= s.charAt(0)=='z'?  (char) (s.charAt(0) -1) : (char) (1+ s.charAt(0));
                ans+=s.charAt(0);
            }

            System.out.println(ans);
        }
    }
}
