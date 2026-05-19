package Class_09_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class r {
    public static void main(String[] args) {
        String s = "1211";
        String temp = "";
        temp = s.substring(2,4);
        int value = Integer.parseInt(temp) ;
        int fv = 'a' + (value-1);
        System.out.println(fv);
        String ans = "";
        ans+=(char)(fv);
        System.out.println(ans);
    }

}
