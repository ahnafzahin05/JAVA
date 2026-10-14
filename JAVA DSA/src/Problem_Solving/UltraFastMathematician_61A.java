package Problem_Solving;

import java.util.Scanner;

public class UltraFastMathematician_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        String num = "";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(i)) num = num+0;
            else num = num+1;
        }
        System.out.println(num);
    }
}
