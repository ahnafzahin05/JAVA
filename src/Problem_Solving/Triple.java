package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test=1; test<=t; test++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            int temp=0;
            if(n<3) System.out.println("-1");
            else{
                for(int i=0; i<n-2;i++){
                    if(arr[i] == arr[i+1] && arr[i]==arr[i+2]){
                        count=1;
                        temp = arr[i];
                        break;
                    }
                }
                if(count==1) System.out.println(temp);
                else System.out.println("-1");
            }

        }
    }
}
