package Class_09_Strings;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbccc";
        System.out.println(nrc(s));
    }

    private static char nrc(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1) return s.charAt(i);
        }
        return '$';
    }
}
