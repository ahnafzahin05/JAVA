package Class_09_Strings;

import java.util.Scanner;

public class CountNumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels++;
        }
        System.out.println(vowels);
    }
}
