package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class insomniaCure_148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[d+1];
        for(int i=k; i<d+1; i+=k) arr[i] = 1;
        for(int i=l; i<d+1; i+=l) arr[i] = 1;
        for(int i=m; i<d+1; i+=m) arr[i] = 1;
        for(int i=n; i<d+1; i+=n) arr[i] = 1;

        Arrays.sort(arr);

        int harmed = 0;
        for(int i=1; i<d+1; i++) if(arr[i]==1) harmed++;
        System.out.println(harmed);
    }
}
