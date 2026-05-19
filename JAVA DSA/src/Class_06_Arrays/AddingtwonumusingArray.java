package Class_06_Arrays;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.max;

public class AddingtwonumusingArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,7,9,9};
        int na = a.length-1, nb = b.length-1;
        ArrayList<Integer> c = new ArrayList<>();
        int i=na, j=nb, carry = 0;
        while(i>=0 && j>=0){
            int sum = a[i--] + b[j--] + carry;
            c.add(0, sum%10);
            carry = sum/10;
        }
        while(i>=0){
            int sum = a[i--] + carry;
            c.add(0,sum%10);
            carry = sum/10;
        }
        while(j>=0){
            int sum = b[j--] + carry;
            c.add(0,sum%10);
            carry = sum/10;
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
