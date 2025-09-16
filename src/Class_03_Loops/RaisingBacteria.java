package Class_03_Loops;

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 1, power=0;
        while(n<a){
            n = n*2;
            if(n>a) break;
            power++;
        }
        int ans = (int) (1+ (a - Math.pow(2,power)));
        System.out.println(ans);
    }
}
