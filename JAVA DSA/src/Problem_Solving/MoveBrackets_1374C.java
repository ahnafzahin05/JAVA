package Problem_Solving;

import java.util.Scanner;

public class MoveBrackets_1374C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            String s = sc.next();
            int nr=0, nl=0, ans = 0;
            boolean flag = true;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)==')'){
                    nr++;
                    flag = true;
                }
                else if(s.charAt(i)=='('){
                    if(flag) {
                        if(nl<nr) ans+= Math.abs(nr-nl);
                        flag = false;
                        nl = 0;
                    }
                    nl++;
                    nr = 0;
                }
            }
            System.out.println(ans);
        }
    }
}
