package Class_09_Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "zahin";
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        str = s.toString();
        System.out.println(str);
    }
}
