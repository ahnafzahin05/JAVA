package Class_09_Strings;

public class CompareTo_Manually {
    public static void main(String[] args) {
        String a = "aarsh";
        String b = "harshh";
        System.out.println(aCompareToB(a,b));
    }

    private static int aCompareToB(String a, String b) {
        int i=0;
        while(i<a.length() && i<b.length()){
            if(a.charAt(i)!=b.charAt(i)) return a.charAt(i) - b.charAt(i);
            i++;
        }
        return a.length() - b.length();
    }
}
