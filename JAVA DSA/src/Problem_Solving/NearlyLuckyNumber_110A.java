package Problem_Solving;

import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long numOfLuckyDig = 0;
        while(n!=0){
            long temp = n%10;
            if(temp==4 || temp==7) numOfLuckyDig++;
            n/=10;
        }

        if(numOfLuckyDig==0) System.out.println("NO");
        else{
            boolean lucky = true;
            while(numOfLuckyDig!=0){
                long temp1 = numOfLuckyDig%10;
                if(temp1==4 || temp1==7) ;
                else{
                    lucky = false;
                    break;
                }
                numOfLuckyDig/=10;
            }
            System.out.println(lucky? "YES" : "NO");
        }

    }
}
