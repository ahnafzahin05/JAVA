package Problem_Solving;

import java.util.Scanner;

public class SoldierAndBananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();

        int totalPrice = 0;
        for(int i=1; i<=w; i++) totalPrice+=i*k;

        int ans = totalPrice - n;
        System.out.println(Math.max(ans,0));
    }
}
