package Class_09_Strings;

import java.util.Scanner;

public class PanagramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }

    public static boolean check(String s){
        int[] checkerArr = new int[26];
        int n = s.length();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z') checkerArr[ch - 'A'] = 1;
            else if(ch>='a' && ch<='z') checkerArr[ch - 32 -'A'] = 1; //first turn it into uppercase and then minus 'A'
        }
        for(int i=0; i<26; i++){
            if(checkerArr[i]==0) return false;
        }
        return true;
    }
}
