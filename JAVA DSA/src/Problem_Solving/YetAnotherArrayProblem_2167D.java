package Problem_Solving;

import java.util.Scanner;

public class YetAnotherArrayProblem_2167D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(long x=2; ; x++){
                boolean found = false;
                for(int i=0; i<n; i++){
                    if( (GCD(x,arr[i]) == 1) ){
                        System.out.println(x);
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }
        }
    }
    public static long GCD(long x, long a){
        long y = a;
        long rem = 0;
        while(y!=0){
            rem = (x%y);
            x = (int) y;
            y = rem;
        }
        return x;
    }
}

