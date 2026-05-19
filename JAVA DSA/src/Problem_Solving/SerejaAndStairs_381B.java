package Problem_Solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SerejaAndStairs_381B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<m; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        int largest = arr.get(0);
        int rem = 0;
        for(int i=1; i<m-1; i++){
            if(arr.get(i) == largest){
                arr.remove(i);
                rem++;
            }
            else break;
        }
        System.out.println(arr);
    }
}
