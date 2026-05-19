package Class_03_Loops;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        for(double i=1; i<=t; i++){
            double n = sc.nextDouble();
            boolean flag = false;
            for(double j=2; j<=n; j++){
                if(n%j==0 && j%2!=0){
                    flag = true; //true if any single odd divisor is present
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
