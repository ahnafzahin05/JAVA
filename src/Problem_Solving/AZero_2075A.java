package Problem_Solving;

import java.util.Scanner;

public class AZero_2075A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            double x = 0;
            int minOps = 0;

            if(n%2==0){
                x = k-1;
                minOps+= (int) Math.ceil(n/x);
                //System.out.println(minOps);
            }
            else{ //n is odd
                x = k;
                n = (int) (n-x); //n becomes even, as odd-odd = even
                minOps++;
                x = k-1;
                minOps+= (int) Math.ceil(n/x);
            }
            System.out.println(minOps);
        }
    }
}
