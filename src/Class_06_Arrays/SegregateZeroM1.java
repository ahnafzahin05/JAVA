package Class_06_Arrays;

import java.util.Scanner;

public class SegregateZeroM1 {
    public static void main(String[] args) {
        //BEST METHOD
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0, j = size - 1; //i-->start, j-->end
        //Two Pointer Method
        while (i < j) {
            if (arr[i] == 0) {
                i++; // already in correct place
            } else if (arr[j] == 1) {
                j--; // already in correct place
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
