package Problem_Solving;

import java.util.Scanner;

public class ShortSubstrings_1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            String s = sc.next();
            String ans = "";
            int i=0;
            for(; i<s.length()-1; i+=2){
                ans+=s.charAt(i);
            }
            ans+=s.charAt(s.length()-1);
            System.out.println(ans);
        }
    }
}
