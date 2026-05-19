package Class_09_Strings;

import java.util.Arrays;

public class MostFreqChar {
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(mostFreq(s));
    }

    private static char mostFreq(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        //counting the frequency of the characters
        int[] freq = new int[26];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]-'a']++; //internally (char - char) does ASCII value subtraction and becomes integer type
        }

        //accessing the most frequent character
        int maxIdx = -1, maxFreq = -1;
        for(int i=0; i<26; i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                maxIdx = i;
            }
        }

        return (char)(maxIdx+97);
    }
}
