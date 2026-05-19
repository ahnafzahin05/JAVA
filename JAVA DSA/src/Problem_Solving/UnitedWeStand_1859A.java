package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnitedWeStand_1859A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            boolean distinct = false;
            for(int i=0; i<n-1; i++){
                if(arr[i]!=arr[i+1]){
                    distinct = true;
                    break;
                }
            }

            if(!distinct) System.out.println("-1");
            else{
                Arrays.sort(arr);
                ArrayList<Integer> b = new ArrayList<>();
                ArrayList<Integer> c = new ArrayList<>();

                boolean one_isPresent = false;
                for(int i=0; i<n; i++){
                    if(arr[i]==1) {
                        one_isPresent = true;
                        break;
                    }
                }

                if(one_isPresent){ //keep all 1's in 'b', and others in 'c'
                    for(int i=0; i<n; i++){
                        if(arr[i]==1) b.add(1);
                        else c.add(arr[i]);
                    }
                }
                else{ //keep the first number (might have multiple occurrences) of array 'a' in 'b', and others in 'c'
                    int idx = 0;
                    for(int i=0 ;i<n-1; i++){
                        if(arr[i]==arr[i+1]) idx = i+1;
                        else break;
                    }
                    for(int i=0; i<=idx; i++) b.add(arr[i]);
                    for(int i=idx+1; i<n; i++) c.add(arr[i]);
                }
                System.out.println(b.size()+" "+c.size());
                for(int ele: b) System.out.print(ele+" ");
                System.out.println();
                for(int ele: c) System.out.print(ele+" ");
                System.out.println();
            }
        }
    }
}
