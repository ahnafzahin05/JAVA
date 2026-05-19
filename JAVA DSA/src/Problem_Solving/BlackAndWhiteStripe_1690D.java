package Problem_Solving;

import java.util.Scanner;

public class BlackAndWhiteStripe_1690D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //length of string
            int k = sc.nextInt(); //k consecutive black
            String s = sc.next();
            if(k==n){
                int wCount = 0;
                for(int i=0; i<n; i++) if(s.charAt(i)=='W') wCount++;
                System.out.println(wCount);
            }
            else{
                int maxBlack = 0, temp = 0;
                for(int i=0; i<n-1; i++){
                    if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='B') temp++;
                    else{
                        if(temp>0) temp++;
                        maxBlack = Math.max(temp,maxBlack);
                        temp = 0;
                    }
                }
                if(temp==0 && s.charAt(n-1)=='B') {
                    temp++;
                    maxBlack = Math.max(temp,maxBlack);
                }
                else if(temp>0) {
                    temp++;
                    maxBlack = Math.max(temp,maxBlack);
                }

                if(maxBlack>=k) System.out.println("0");
                else System.out.println(k-maxBlack);
            }
        }
    }
}
