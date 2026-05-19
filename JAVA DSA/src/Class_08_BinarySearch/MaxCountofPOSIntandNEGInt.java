package Class_08_BinarySearch;

public class MaxCountofPOSIntandNEGInt {
    //LeetCode 2529
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        //finding the last occurrence of NEG
        int left=0, right=nums.length-1, index=-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]<0){
                index = mid;
                left = mid+1;
            }
            else right = mid-1; //if(arr[mid]>=0)
        }
        int NEG = index + 1;

        //Finding the first occurrence of POS
        left = 0; right = nums.length-1;
        int firstindex = -1;
        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]>0){
                firstindex = mid;
                right = mid - 1;
            }
            else if(nums[mid]<=0){
                left = mid + 1;
            }
        }
        int POS = 0;
        if(firstindex!=-1) POS = nums.length - firstindex;
        return Math.max(POS, NEG);
    }
}
