package Problem_Solving;

import java.util.Scanner;

public class YuuKoitoAndMinimumAbsoluteSum_2171B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t<=test; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int min = 0;

            if(arr[0]!=-1 && arr[n-1]!=-1) min = Math.abs(arr[0]-arr[n-1]); //no corner with -1
            else if(arr[0]==-1 && arr[n-1]!=-1) arr[0] = arr[n-1]; //left corner with -1
            else if(arr[0]!=-1 && arr[n-1]==-1) arr[n-1] = arr[0]; //right corner with -1
            else{ //both corner with -1
                arr[0] = 0;
                arr[n-1] = 0;
            }

            for(int i=1; i<n-1; i++) if(arr[i]==-1) arr[i] = 0;
            System.out.println(min);
            print(arr);
        }
    }
    public static void print (int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

