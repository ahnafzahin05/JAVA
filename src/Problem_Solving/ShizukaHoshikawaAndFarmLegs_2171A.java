package Problem_Solving;

import java.util.Scanner;

public class ShizukaHoshikawaAndFarmLegs_2171A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t<=test; t++){
            int n = sc.nextInt();
            if(n%2 == 0) {
                int ans = 0;
                ans+= n/4 +1;
                System.out.println(ans);
            }
            else System.out.println(0);
        }
    }
}
