package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int teamv = 0;
        int compare = 0;
        for(int i=0; i<n; i++){
            if(5-arr[i]>=k) teamv++;
            if(teamv==3){
                compare++;
                teamv = 0;
            }
        }
        System.out.println(compare);
    }
}
