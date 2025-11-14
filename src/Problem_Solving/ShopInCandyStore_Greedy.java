package Problem_Solving;

import java.util.Arrays;

public class ShopInCandyStore_Greedy {
    public static void main(String[] args) {
        int[] prices = {3,2,1,4,5};
        int k=4;
        System.out.println(Arrays.toString(minMaxCandy(prices, k)));
    }
    public static int[] minMaxCandy(int[] prices, int k){
        int[] ans = new int[2];
        Arrays.sort(prices);
        int min=0, max=0;
        int i=0, j=prices.length-1;
        while(i<=j){
            min+=prices[i];
            j = j-k;
            i++;
        }
        ans[0] = min;

        i=0; j=prices.length-1;
        while(i<=j){
            max+=prices[j];
            i = i+k;
            j--;
        }
        ans[1] = max;
        return ans;
    }
}
