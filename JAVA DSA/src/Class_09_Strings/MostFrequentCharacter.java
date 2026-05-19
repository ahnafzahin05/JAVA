package Class_09_Strings;

import java.util.Arrays;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "aabccdddeeee";
        System.out.println(getMaxOccuringChar(s));
    }
    public static char getMaxOccuringChar(String s){
        //Method-3: Frequency Array (similar to HashMap) O(n)
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        int max = -1;
        char ans = '\n';
        for(int i=0; i<26; i++){
            if(freq[i]>max) {
                max = freq[i];
                ans = (char)(i+'a');
            }
        }
        return ans;


//        //Method-2: (Sorting) O(nlogn) Sliding Window Algo

//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        int i=0, j=1;
//        int maxW = -1;
//        char ans = '0';
//        while(j<s.length()){
//            if(arr[i] == arr[j]) j++;
//            else{
//                if(j-i>maxW) {
//                    maxW = j-i;
//                    ans = arr[i];
//                }
//                i = j++;
//            }
//        }
//        if(j-i>maxW) {
//            maxW = j-i;
//            ans = arr[i];
//        }
//        System.out.println(ans);




//         Method-1: O(n^2)
//        int n = s.length();
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//        for(int i=0; i<n; i++){
//            int freq = 1;
//            for(int j=i+1; j<n; j++){
//                if(s.charAt(j) == s.charAt(i)) freq++;
//            }
//            if(freq>maxFreq){
//                maxFreq = freq;
//                ans = s.charAt(i);
//            }
//            else if(freq == maxFreq && s.charAt(i)<ans) ans = s.charAt(i);
//        }
//        return ans;
    }
}
