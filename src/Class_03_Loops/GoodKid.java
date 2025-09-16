package Class_03_Loops;

import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n =sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int j=1; j<=n; j++){
                int a = sc.nextInt();
                if(a<min) min = a;
            }
        }
    }
}
