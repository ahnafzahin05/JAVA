package Problem_Solving;

import java.util.Scanner;

public class MostUnstableArray_1353A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt(); //array length
            int m = sc.nextInt(); //array element sum
            if(n==1) System.out.println("0");
            else if(n==2) System.out.println(m);
            else System.out.println(2*m);
        }
    }
}
