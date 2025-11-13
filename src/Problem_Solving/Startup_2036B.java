package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Startup_2036B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt(); //no. of shelves
            int k = sc.nextInt(); //no. of bottles
            int[] arr = new int[k]; //joto gula bottle, toto length er array
            for(int i=1; i<=k; i++){ //jei koita bottle, toto koibar input
                int b = sc.nextInt(); //brand index
                int c = sc.nextInt(); //cost
                arr[b-1]+= c; //storing the total amount of each brands in their respective indexes, for brand 1 its index is 0, brand-2 index 1 and so on
            }
            Arrays.sort(arr);
            int max = 0;
            for(int i=1; i<=n && i<=k; i++){ //joto gula shelves, toto gula largest value er sum
                max+= arr[k-i];
            }
            System.out.println(max);
        }
    }
}
