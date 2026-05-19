package Problem_Solving;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int lc = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)>='a') lc++;
        }
        int uc = n - lc;
        if(uc>lc) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());
    }
}
