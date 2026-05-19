package Class_05_Methods;

import java.util.Scanner;

public class PnC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int Permutation = nPr(n,r);
        int Combination = nCr(n,r);
        System.out.println(Permutation);
        System.out.println(Combination);
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static int nPr(int n, int r){
        return fact(n)/fact((n-r));
    }
    public static int nCr(int n, int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
}
