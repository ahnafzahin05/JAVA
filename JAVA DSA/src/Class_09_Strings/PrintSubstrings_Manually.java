package Class_09_Strings;

public class PrintSubstrings_Manually {
    public static void main(String[] args) {
        String s = "zahin";
        for(int i=0; i<s.length(); i++){
            String sub = "";
            for(int j=i; j<s.length(); j++){
                sub+=s.charAt(j);
                System.out.println(sub);
            }
        }
    }
}
