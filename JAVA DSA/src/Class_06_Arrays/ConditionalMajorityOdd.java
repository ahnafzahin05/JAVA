package Class_06_Arrays;

import java.util.Scanner;

public class ConditionalMajorityOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //no. of voters
        int[] votes = new int[n];

        for(int i=0; i<n; i++) votes[i] = sc.nextInt();

        int validCount = 0;

        //Count valid votes (odd indices)
        for(int i=1; i<n; i+=2) validCount++;

        //Check majority among valid votes
        for(int i=1; i<n; i+=2){
            int count = 0;
            for(int j=1; j<n; j+=2){
                if(votes[i]==votes[j]) count++;
            }
            if(count>validCount/2){
                System.out.println(votes[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
