package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IWannaBeTheGuy_469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = sc.nextInt();
        int[] p_arr = new int[p];
        for(int i=0; i<p; i++) p_arr[i] = sc.nextInt();

        int q = sc.nextInt();
        int[] q_arr = new int[q];
        for(int i=0; i<q; i++) q_arr[i] = sc.nextInt();

        Arrays.sort(p_arr);
        Arrays.sort(q_arr);
        ArrayList<Integer> a = new ArrayList<>();
        //Merging two sorted array
        int i=0, j=0;
        while(i<p && j<q){
            if(p_arr[i]<q_arr[j]) a.add(p_arr[i++]);
            else if(p_arr[i]==q_arr[j]) {
                a.add(q_arr[j++]);
                i++;
            }
            else a.add(q_arr[j++]);
        }
        while(i<p) a.add(p_arr[i++]);
        while(j<q) a.add(q_arr[j++]);

        if(a.size()==n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
