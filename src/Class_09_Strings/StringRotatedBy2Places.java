package Class_09_Strings;

public class StringRotatedBy2Places {
    public static void main(String[] args) {
        String s1 = "a", s2 = "a";
        System.out.println(check(s1,s2));
    }

    private static boolean check(String s1, String s2) {
        int n = s1.length();
        if(n!=s2.length()) return false;

        if(n==1) return s1.equals(s2);
        else{
            String lr = s1.substring(2,n) + s1.substring(0,2); //new string after left rotation
            String rr = s1.substring(n-2,n) + s1.substring(0,n-2); //new string after right rotation
            return (s2.equals(lr) || s2.equals(rr));
        }
    }
}
