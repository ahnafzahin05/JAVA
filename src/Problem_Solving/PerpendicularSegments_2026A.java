package Problem_Solving;

import java.util.Scanner;

public class PerpendicularSegments_2026A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if(k<=x && k<=y){
                int[] l1 = {0,0,k,0};
                int[] l2 = {0,0,0,k};
                for(int ele: l1) System.out.print(ele+" ");
                System.out.println();
                for(int ele: l2) System.out.print(ele+" ");
                System.out.println();
            }

        }
    }
}
