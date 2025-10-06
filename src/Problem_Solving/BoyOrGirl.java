package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int distinct = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]) distinct++;
        }
//        if(distinct % 2 !=0) System.out.println("CHAT WITH HER!");
//        else System.out.println("IGNORE HIM!");
        distinct++;
        if(distinct % 2 !=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
