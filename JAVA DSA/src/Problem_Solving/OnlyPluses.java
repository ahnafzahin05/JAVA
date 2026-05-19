package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class OnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test=1; test<=t; test++){
            int[] arr = new int[3];
            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            while(count<5){
                if(arr[0]<arr[1]) arr[0]++;
                else if(arr[0]==arr[1] && arr[0]<arr[2]) arr[0]++;
                else if(arr[0]>arr[1] && arr[1]<arr[2]) arr[1]++;
                else arr[2]++;
                count++;
            }
            System.out.println(arr[0]*arr[1]*arr[2]);
        }
    }
}
