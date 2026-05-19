package Class_08_BinarySearch;

public class KthMissingPOSNumSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(missingValue(arr,k));
    }
    public static int missingValue(int[] arr, int k){
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            int originalValue = mid + 1;
            int numOfMissingValues = arr[mid] - originalValue;

            if(numOfMissingValues>=k) right = mid-1;
            else left = mid+1;
        }
        return left+k; //right+1+k
        //left is the first index where the first missing occurs/starts, then add k to it to get the req value
    }
}
