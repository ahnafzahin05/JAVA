package Class_06_Arrays;

public class TrappingRainWaterM2 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,5,2,6,2,3};
        System.out.println(water(arr));
    }
//https://leetcode.com/problems/trapping-rain-water/solutions/7154224/two-pointers-approach-beats-100-detailed-mkgv/
    private static int water(int[] arr) {
        int n = arr.length;
        int w = 0, left = 0, right = n-1, leftMax = 0, rightMax = 0;
        while(left<right){
            if(arr[left]<=arr[left+1]) {
                if(arr[left]>=leftMax) leftMax = arr[left];
                else w+= leftMax - arr[left];
                left++;
            }
            else {
                if(arr[right]>=rightMax) rightMax = arr[right];
                else w+= rightMax - arr[right];
                right--;
            }
        }
        return w;
    }
}
