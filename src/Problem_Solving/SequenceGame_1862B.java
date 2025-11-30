package Problem_Solving;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame_1862B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            a.add(arr[0]);

            for(int i=1; i<n; i++){
                if(arr[i]>=arr[i-1]) a.add(arr[i]);
                else {
                    a.add(1);
                    a.add(arr[i]);
                }
            }
            System.out.println(a.size());
            for(int ele: a) System.out.print(ele+" ");
            System.out.println();

            //using array
//            int count = 0;
//            for(int i=1; i<n; i++) if(arr[i]<arr[i-1]) count++;
//
//            int[] ans = new int[n+count];
//            ans[0] = arr[0];
//
//            int j=1;
//            for(int i=1; i<n; i++){
//                if(arr[i]>=arr[i-1]) ans[j++] = arr[i];
//                else {
//                    ans[j++] = 1;
//                    ans[j++] = arr[i];
//                }
//            }
//            System.out.println(ans.length);
//            for(int ele: ans){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
        }
    }
}
