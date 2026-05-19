package Problem_Solving;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        if(s.charAt(0)>='a'){
            arr[0] = (char)(arr[0]-32);
        }
        String ans = new String(arr);
        System.out.println(ans);
    }
}
