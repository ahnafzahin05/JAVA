package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class MagicNumber_320A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();

        if(magic(arr)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean magic(char[] arr){
        if(arr[0] == '4') return false;

        Arrays.sort(arr);
        String ans = "";
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]) ans+=arr[i];
        }
        ans+=arr[arr.length-1];
        if(ans.equals("1") || ans.equals("14")) return true;
        return false;
    }
}
