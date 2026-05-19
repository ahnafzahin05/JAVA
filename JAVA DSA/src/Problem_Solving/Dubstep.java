package Problem_Solving;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        int i=0;
        while(i<s.length()){
            if(i<=s.length()-3 && s.substring(i,i+3).equals("WUB")){
                if(ans.length()>0) ans+= " ";
                i = i+3;
            }else{
                ans+=s.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }
}
