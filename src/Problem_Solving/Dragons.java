package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] a1 = Arrays.copyOf(a,a.length);
        Arrays.sort(a1);
        int[] b1 = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[j] == a1[i]){
                    b1[i] = b[j];
                }
            }
        }
        int i=0, defeat=0;
        while(i<n){
            if(s>a1[i]){
                s+=b1[i];
                defeat++;
            }
            i++;
        }
        if(defeat==n) System.out.println("YES");
        else System.out.println("NO");
    }
}
