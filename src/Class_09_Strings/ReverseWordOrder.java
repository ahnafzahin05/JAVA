package Class_09_Strings;

import java.util.Scanner;

public class ReverseWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        String temp = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(temp.length()>0) ans+= temp + " ";
                temp = "";
            }
            else temp = s.charAt(i) + temp;
        }
        if(temp.length()>0) ans+= temp;
        System.out.println(ans);
    }
}
