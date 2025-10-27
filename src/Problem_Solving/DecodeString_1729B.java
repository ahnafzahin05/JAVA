package Problem_Solving;

import java.util.Scanner;

public class DecodeString_1729B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            String s = sc.next();
            int i = n-1;
            int value = 0, fv = 0;
            String ans = "";
            while(i>=2){
                if(s.charAt(i)=='0'){
                    String temp = s.substring(i-2,i);
                    value = Integer.parseInt(temp);
                    fv = 'a' + (value-1);
                    ans =(char)(fv)+ans;
                    i = i-3;
                }
                else{
                    value = s.charAt(i) -48;
                    fv = 'a' + (value-1);
                    ans =(char)(fv)+ans;
                    i--;
                }
            }
            while(i>=0){
                value = s.charAt(i) -48;
                fv = 'a' + (value-1);
                ans =(char)(fv)+ans;
                i--;
            }
            System.out.println(ans);
        }

    }
}
