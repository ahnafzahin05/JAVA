package Problem_Solving;

import java.util.Scanner;

public class MyFirstSortingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(Math.min(x,y));
            System.out.println(Math.max(x,y));
        }
    }
}
