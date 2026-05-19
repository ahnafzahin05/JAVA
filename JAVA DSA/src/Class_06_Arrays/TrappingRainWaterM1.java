package Class_06_Arrays;

public class TrappingRainWaterM1 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,5,2,6,2,3};
        System.out.println(water(arr));
    }

    private static int water(int[] arr) {
        int n = arr.length;
        int w = 0, peakIdx = -1, peakMax = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>peakMax){
                peakMax = arr[i];
                peakIdx = i;
            }
        }
        int leftMax = arr[0];
        for(int i=0; i<peakIdx; i++){
            if(arr[i] < leftMax) w+= leftMax - arr[i]; //(leftMax-arr[i]) > 0, store water
            else leftMax = arr[i]; //(leftMax-arr[i]) <= 0
        }
        int rightMax = arr[n-1];
        for(int i=n-2; i>peakIdx; i--){
            if(arr[i] < rightMax) w+= rightMax - arr[i]; //(rightMax - arr[i]) > 0, store water
            else rightMax = arr[i]; //(rightMax-arr[i]) <= 0
        }
        return w;
    }
}
