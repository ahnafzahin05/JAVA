package Problem_Solving;

import java.util.Scanner;

public class LineTrip_1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] gasStation = new int[n];
            for(int i=0; i<n; i++) gasStation[i] = sc.nextInt();
            int maxDiff = gasStation[0];
            for(int i=1; i<n; i++){
                if(gasStation[i]-gasStation[i-1] > maxDiff) maxDiff = gasStation[i]-gasStation[i-1];
            }
            if((x-gasStation[n-1])*2 > maxDiff) maxDiff = (x-gasStation[n-1])*2;
            System.out.println(maxDiff);
        }
    }
}
