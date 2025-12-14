package Class_07_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {3,4,3,2,2,4};
        int[] b = {3,2,2,7,3,4};
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){ //choto takey agey barao
                j++;
            }else{
                i++;
            }
        }
        System.out.println(ans);


//        int j=0;
//        while(j<b.length){
//            int i=0;
//            while(i<a.length){
//                if(a[i]==b[j])
//                {
//                    System.out.printNto1(a[i]+" ");
//                    a[i] = Integer.MIN_VALUE;
//                    break;
//                }
//                i++;
//            }
//            j++;
//        }
    }
}
