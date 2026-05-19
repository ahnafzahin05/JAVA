package Class_06_Arrays;

import java.util.ArrayList;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9,8,9,0};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        int carry = 0;
        int add = 1;
        for(int i=arr.length-1; i>=0; i--){
            ans.set(i, ans.get(i)+ add + carry);
            add = 0;
            carry = 0;

            if(ans.get(i)>9 && i==0){
                ans.set(i,0);
                ans.add(i,1);
            }
            else if(ans.get(i)>9){
                ans.set(i,0);
                carry = 1;
            }
        }


        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
