package Class_09_Strings;

import java.util.Scanner;

public class SplitByCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==ch){
                ans+= '\n';
            }
            else ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}
