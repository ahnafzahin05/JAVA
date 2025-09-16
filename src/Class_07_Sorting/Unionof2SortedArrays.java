package Class_07_Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Unionof2SortedArrays {
    public static void main(String[] args) {
        int[] a = {2,2,3,4,5};
        int[] b = {1,1,2,3,4};
        ArrayList<Integer> add = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length){
            add.add(a[i]);
        }
        while( j<b.length){
            add.add(b[j]);
        }
        Collections.sort(add);
        for(int k=0, l=1; k< add.size(); k++, l++){

        }


        System.out.println(add);
    }
}
