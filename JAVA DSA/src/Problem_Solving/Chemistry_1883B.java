package Problem_Solving;

import java.util.Scanner;

public class Chemistry_1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26]; //frequency array
            for(int i=0; i<n; i++){
                freq[s.charAt(i)-'a']++;
            }
            //A palindrome can have maximum 1 odd frequency digit/character
            int noOfOddOccurrence = 0;
            for(int i=0; i<26; i++) if(freq[i]%2==1) noOfOddOccurrence++;

            System.out.println(k>=(noOfOddOccurrence-1) ? "YES" : "NO");
        }
    }
}
