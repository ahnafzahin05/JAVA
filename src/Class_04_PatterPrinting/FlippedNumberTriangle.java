package Class_04_PatterPrinting;

import java.util.Scanner;

public class FlippedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
