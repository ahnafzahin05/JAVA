package Class_06_Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {5,4,3,2,1};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] x){
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
