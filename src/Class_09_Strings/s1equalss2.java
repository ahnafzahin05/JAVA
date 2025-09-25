package Class_09_Strings;

public class s1equalss2 {
    public static void main(String[] args) {
        String s1 = "Zahin";
        String s2 = new String("Zahin");
        System.out.println(s1==s2); //compares address
        System.out.println(s1.equals(s2)); //compares both string character by character
    }
}
