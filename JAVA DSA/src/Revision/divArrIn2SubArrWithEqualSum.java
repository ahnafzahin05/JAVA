package Revision;

import java.util.Arrays;

public class divArrIn2SubArrWithEqualSum {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,5,8,20,-10,8};
        int n = arr.length;

        int totalSum = 0, k=-1;
        for(int i=0; i<n; i++) totalSum+=arr[i];

        int pS = 0;
        for(int i=0; i<n; i++){
            pS+=arr[i];
            if(pS==(totalSum-pS)){
                k = i;
                break;
            }
        }

        if(k==-1) System.out.println("DNE");
        else{
            int[] s1 = new int[k+1];
            int[] s2 = new int[n-k-1];

            for(int i=0; i<k+1; i++) s1[i] = arr[i];
            int idx = 0;
            for(int i=k+1; i<n; i++) s2[idx++] = arr[i];
            System.out.println(Arrays.toString(s1));
            System.out.println(Arrays.toString(s2));
        }
    }
}
