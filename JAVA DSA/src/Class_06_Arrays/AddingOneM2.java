package Class_06_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOneM2 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,8,9};
        int n = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1; //adding 1 to the right most digit

        for(int i=n; i>=0; i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
