package Problem_Solving;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toUpperCase();
        b = b.toUpperCase();
        System.out.println(stringCompare(a,b));
    }

    private static int stringCompare(String a, String b) {
        int n = a.length();
        for(int i=0; i<n; i++){
            if(a.charAt(i) > b.charAt(i)) return 1;
            else if(a.charAt(i) < b.charAt(i)) return -1;
        }
        return 0;
    }
}
