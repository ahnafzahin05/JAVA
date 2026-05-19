package Class_08_BinarySearch;

public class SearchanEleInSortedandRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int K = 2;
        System.out.println(Search(arr,K));
    }
    public static int Search(int arr[], int target){
        int n = arr.length-1;
        //Finding the pivot point
        int left=0, right=n;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]<arr[right]) right = mid; //This means right part is sorted
            else left = mid+1;
        }
        //Applying Binary Search 2 times
        int l1=0, l2 = left, r1 = l2 - 1, r2=n;
        while(l1<=r1){
            int mid = l1 + (r1-l1)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) r1 = mid-1;
            else l1 = mid+1;
        }
        while(l2<=r2){
            int mid = l2 + (r2-l2)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) r2 = mid-1;
            else l2 = mid+1;
        }
        return -1;
    }
}
