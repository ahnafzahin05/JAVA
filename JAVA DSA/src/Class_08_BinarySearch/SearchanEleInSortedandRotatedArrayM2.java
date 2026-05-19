package Class_08_BinarySearch;

public class SearchanEleInSortedandRotatedArrayM2 {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int K = 3;
        System.out.println(Search(arr,K));
    }
    public static int Search(int arr[], int tar){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            //Finding a Sorted Half, then finding whether the target falls on the range of sorted part or not.
            if(arr[mid]==tar) return mid;
            else if(arr[mid]>arr[left]){ //left to mid is sorted
                if(tar>=arr[left] && tar<arr[mid]) right = mid-1; //target falls on the sorted range
                else left = mid+1; //target doesn't fall on the sorted range, go right
            }
            else{ //mid to right is sorted
                if(tar<=arr[right] && tar>arr[mid]) left = mid+1; //target falls on the sorted range
                else right = mid - 1; //target doesn't fall on the sorted range, go left
            }
        }
        return -1;
    }
}
