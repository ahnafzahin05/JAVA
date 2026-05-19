package Class_06_Arrays;

import java.util.ArrayList;

public class AddingOneM3 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,8};
        int n = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for(int i=n; i>=0; i--){
            int sum = arr[i] + carry;
            ans.add(0, sum%10);
            carry = sum/10;
        }
        if(carry==1){
            ans.add(0, carry);
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
