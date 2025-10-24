package Class_09_Strings;

import java.util.Scanner;

public class isSubstringPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(isPresent(s,sub));
    }

    private static boolean isPresent(String s, String sub) {
        int i=0, j=0;
        while(i<sub.length() && j<s.length()){
            if(s.charAt(j) == sub.charAt(i)){
                if(i == sub.length()-1) return true;
                i++;
            }
            else i=0;
            j++;
        }
        return false;
    }
}
