package Class_06_Arrays;

public class MaxDiffBetwTwoEle {
    public static void main(String[] args) {
        int[] arr = {9,5,8,12,2,3,7,4};
        System.out.println(maxDiff(arr));
    }
    //LeetCode 2016. Maximum Difference Between Increasing Elements
    //diff betw index i and the largest element after index i
    //using suffix max we contained the largest element after index i (to the right)
    private static int maxDiff(int[] arr) {
        int maxDiff = -1;
        int sufMax = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            int diff = sufMax - arr[i];
            if(diff>maxDiff && sufMax>arr[i]) maxDiff = diff;
            if(arr[i]>sufMax) sufMax = arr[i];
        }
        return maxDiff;
    }
}
