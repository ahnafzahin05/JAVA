package Problem_Solving;

import java.util.Scanner;

public class SleepingThroughClasses_2173A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //length of string
            int k = sc.nextInt(); //recovery time
            String s = sc.next();
            int sleep = 0;
            int i=0;
            for(; i<n; i++){
                if(s.charAt(i)=='0') sleep++;
                else break;
            }
            int zero = 0;
            for(; i<n; i++){
                if(s.charAt(i)=='0') zero++;
                else{
                    if(zero>k) sleep+=(zero-k);
                    zero=0;
                }
            }
            if(zero>k) sleep+=(zero-k);
            System.out.println(sleep);
        }
    }
}
