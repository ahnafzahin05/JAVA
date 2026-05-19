package Class_09_Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "zahin";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        StringBuilder a = new StringBuilder(s);
        //a.reverse(); reverse using built-in method
        int i = 0, j = a.length()-1;
        while(i<j){
            char temp = a.charAt(i);
            a.setCharAt(i, a.charAt(j));
            a.setCharAt(j, temp);
            i++; j--;
        }
        return a.toString();
    }
}
