package Class_09_Strings;

import java.util.Scanner;

public class toLowerCase_Manual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toLowerCase(s));
    }

    private static String toLowerCase(String s) {
        //Method - 1 (Fast & Efficient)
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<'a') arr[i] = (char) (arr[i]+32);
        }
        String ans = new String(arr);
        return ans;

        //Method -2 //Slow (string concatenation)
//        String ans = "";
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)>='A' && s.charAt(i)<='Z') ans+=(char)(s.charAt(i)+32);
//            else ans+=s.charAt(i);
//        }
//        return ans;
    }
}
