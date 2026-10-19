package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class antonAndLetter_443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] freqArr = new int[26];
        for(int i=1; i<n-1; i+=3) freqArr[s.charAt(i)-'a']++;
        Arrays.sort(freqArr);
        int distinctEle = 0;
        for(int i=0; i<26; i++) if(freqArr[i]!=0) distinctEle++;
        System.out.println(distinctEle);
    }
}
