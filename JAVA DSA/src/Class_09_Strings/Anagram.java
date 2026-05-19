package Class_09_Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Two strings are anagrams if they use the same characters with the same frequency, just arranged in a different order.
        //Same letters, Same counts, Order doesn’t matter
        String s1 = "latent";
        String s2 = "talent";
        System.out.println(areAnagrams(s1,s2));
    }
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }

}
