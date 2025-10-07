package Problem_Solving;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder(s);
        String ans = "";
        boolean flag = false;
        int i=0;
        while(i<s.length()){
            String check = "WUB";
            String found = a.substring(i,i+3);
            if(found.equals(check)) {
                i+=3;
                flag = true;
            }
            else{
                if(!flag) ans+=s.charAt(i++);
                else {
                    ans+= " " + s.charAt(i++);
                    flag = false;
                }
            }
        }
        System.out.println(ans);
    }
}
