package Class_09_Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}

