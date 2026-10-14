package Revision;

import java.util.Arrays;

public class segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0};
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==1){ //if i th index is 1 then fix it, and search for 0 in the j th index
                if(arr[j]==0){ //swap, increment i, decrement j
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
                j--; //basically j is decreased in both cases, whether it has zero or not
                //if we get 0 in j th index then we swap and decrease j, and if we dont get 0 in j th index
                //we also decrease j to find the 0
            }
            else i++; // if i th index isn't 1, increment i
        }
        System.out.println(Arrays.toString(arr));
    }
}
