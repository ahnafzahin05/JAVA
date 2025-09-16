package Problem_Solving;

import java.util.Scanner;

public class IntegerPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int[] a = new int[n];

            int m = sc.nextInt();
            int[] b = new int[m];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                b[i] = sc.nextInt();
            }
            int count=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if((a[i]+b[j])%2==0 && (b[j]-a[i])%2==0) count++;
                }
            }
            System.out.println(count);
        }
    }
}
