package Problem_Solving;

import java.util.Scanner;

public class cAPS_LOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') count++;
        }

        String ans = "";
        if(s.charAt(0)>='a' && s.charAt(0)<='z' && count == s.length()-1){
            for(int i=0; i<s.length(); i++){
                if(i==0) ans+= (char)(s.charAt(i)-32);
                else ans+= (char)(s.charAt(i)+32);
            }
            System.out.println(ans);
        }
        else if(count == s.length()){
            for(int i=0; i<s.length(); i++){
                ans+= (char)(s.charAt(i)+32);
            }
            System.out.println(ans);
        }
        else System.out.println(s);
    }
}
