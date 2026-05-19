package Class_09_Strings;

import java.util.Scanner;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='.'){
                ans.append("[");
                ans.append(".");
                ans.append("]");
            }
            else ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
}
