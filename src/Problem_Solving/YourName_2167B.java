package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class YourName_2167B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            char[] a1 = a.toCharArray();
            Arrays.sort(a1);
            char[] b1 = b.toCharArray();
            Arrays.sort(b1);
            boolean flag = true;
            for(int i=0; i<a.length(); i++){
                if(a1[i] != b1[i]) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
        }
    }
}
