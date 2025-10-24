package Problem_Solving;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String wub = "WUB";
        String temp = "";
        String ans = "";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(j) == wub.charAt(i)){
                temp+=s.charAt(j);
                if(i==2) {
                    ans+= temp + " ";
                    temp = "";
                    i=0;
                }
                else {
                    i++;
                }
            }
            else{
                i=0;
                temp+=s.charAt(j);
            }
            j++;
        }
        ans+= temp;
        System.out.println(ans);
    }
}
