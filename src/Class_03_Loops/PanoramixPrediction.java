package Class_03_Loops;

import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nextPrime = n;

        for(int i=n+1; ; i++){
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
                else{
                    //nextPrime = i;
                    flag = true;
                }
            }
            if(flag==true){
                nextPrime = i;
                break;
            }
        }
        if(nextPrime ==m) System.out.println("YES");
        else System.out.println("NO");
    }
}
