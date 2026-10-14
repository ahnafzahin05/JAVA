package Problem_Solving;

import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int a = (n/2) + 1;
            System.out.println(n- a);
        }
    }
}
