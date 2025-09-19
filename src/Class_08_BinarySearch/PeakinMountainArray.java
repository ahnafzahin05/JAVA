package Class_08_BinarySearch;

public class PeakinMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,20,15,0};
        int left=0, right=arr.length-1;

        // Use left < right (boundary pattern)
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with mid+1 to determine which side we're on
            if (arr[mid] < arr[mid + 1]) {
                // We're on ascending part, peak is to the right
                // mid cannot be peak, so left = mid + 1
                left = mid + 1;
            } else {
                // arr[mid] > arr[mid + 1] (descending part or at peak)
                // mid COULD be the peak, so right = mid (not mid - 1)
                right = mid;
            }
        }
        // When left == right, we found the peak
        System.out.println(left+" "+arr[left]);

        //Another approach
        // As the given array is guaranteed to be a mountain array, that means it's first and last element can never be peak
        //so we can initialize left = 1 (from index 1) and right = arr.length - 2 (lastindex - 1)
//        int[] arr = {0,1,0};
//        int left = 1, right = arr.length-2;
//        while(left<=right){
//            int mid = (left+right)/2;
//
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
//                System.out.println(mid+" "+arr[mid]);
//                break;
//            }
//            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) left = mid+1;
//            else right = mid-1;
//        }
    }
}
