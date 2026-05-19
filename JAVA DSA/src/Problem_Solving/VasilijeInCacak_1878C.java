package Problem_Solving;

import java.util.Scanner;

public class VasilijeInCacak_1878C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong(); //given values from 1,2,3,......,n
            long k = sc.nextLong(); //have to choose exactly k integers from 1 to n
            long x = sc.nextLong(); //target sum is x
            double l = k*(k+1)/2.0, m = k*(2*n-k+1)/2.0; //l = sum of first kth term, m = sum of first kth largest term
            System.out.println( (x>=l && x<=m)? "YES" : "NO");
        }
    }
}
