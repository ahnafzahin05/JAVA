package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[12];
        for(int i=0; i<12; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minyear=0;
        int compare=0;
        for(int i=11; i>=0; i--){
            if(compare>=k) break;
            else{
                compare+=arr[i];
                minyear++;
            }
        }
        if(compare>=k) System.out.println(minyear);
        else System.out.println("-1");
    }
}
