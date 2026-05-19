package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class IsamatdinAndHisMagicWand_2167C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int odd = 0, even = 0;
            for(int i=0; i<n; i++){
                if(arr[i]%2 ==0) even++;
                else odd++;
            }
            if(odd>=1 && even>=1) Arrays.sort(arr);
            for(int ele: arr){
                System.out.print(ele + " ");
            }
//            int i=0, j=1;
//            while(i<n && j<n){
//                int swap = 0;
//                for(int ini = j; ini<n; ini++){
//                    if((arr[i]>arr[ini]) && (arr[i]%2 != arr[ini]%2)){
//                        int temp = arr[i];
//                        arr[i] = arr[ini];
//                        arr[ini] = temp;
//                        swap = 1;
//                    }
//                }
//
//                if(swap==1) j++;
//                else {
//                    i++;
//                    j = i+1;
//                }
//            }


        }
    }
}
