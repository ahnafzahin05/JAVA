package Problem_Solving;

import java.util.Scanner;

public class NmeetingsInOneRoom_Greedy {
    public static void main(String[] args) {
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};
        System.out.println(maxMeetings(start, end));
    }

    private static int maxMeetings(int[] start, int[] end) {
        int swaps = 1;
        int n = start.length;
        while(swaps!=0){
            int idx = 0;
            swaps = 0;
            for(int i=0; i<n-1; i++){
                if(start[i]>start[i+1]){
                    int temp = start[i];
                    start[i] = start[i+1];
                    start[i+1] = temp;

                    int temp2 = end[i];
                    end[i] = end[i+1];
                    end[i+1] = temp2;

                    swaps = 1;
                }
            }
        }
        int cancel = 0;
        for(int i=0; i<n-1; i++){
            if(start[i+1]<=end[i]) {
                cancel++;
                i++;
            }
        }
        return n-cancel;
    }
}
