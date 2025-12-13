package Class_09_Strings;

import java.util.Scanner;

public class SortStringInSinglePass {
    public static void main(String[] args) {
        //sort a string in O(n)
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sort(s));
    }
    public static String sort(String s){
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) freq[s.charAt(i)-'a']++;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            while(freq[i]-->0) ans.append((char)('a'+i));
        }
        return new String(ans);
    }
}
