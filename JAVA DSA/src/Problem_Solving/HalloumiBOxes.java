package Problem_Solving;

import java.util.Scanner;

public class HalloumiBOxes {
    public static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt(); //number of boxes
            int k = sc.nextInt(); //length of the max reverse
        }
    }
}
