package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            ArrayList<Integer> ans = new ArrayList<>();
            for(int j=0; j<n; j++){
                ans.add(a[j]);
            }
            for(int j=0; j<n-1; j++){
                if(ans.get(j).equals(ans.get(j+1))) {
                    ans.remove(j+1);
                }
            }
            n = ans.size();
            int p=0, q=n-1;
//            while(q>0){
//                if(ans.get(p) - ans.get(q) <= 1){
//                    if (ans.get(i) < ans.get(j)) {
//                        ans.remove(i);  // remove index i
//                        System.out.println("Removed index " + i);
//                    } else {
//                        ans.remove(j);  // remove index j
//                        System.out.println("Removed index " + j);
//                    }
//                }
//            }

        }
    }
}
