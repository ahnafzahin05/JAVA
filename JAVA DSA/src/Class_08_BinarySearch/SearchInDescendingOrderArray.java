package Class_08_BinarySearch;

public class SearchInDescendingOrderArray {
    public static void main(String[] args) {
        //int[] arr = {12, 12, 11, 10, 10, 3, 3, 3, 3, 0, -5, -5, -6, -10, -10};
        int[] arr = {12, 11, 10, 3, 0, -5, -6, -10};
        int target = 10;
        int left = 0, right = arr.length-1, index = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                index = mid;
                break;
            }
            else if(arr[mid]>target){
                left = mid+1; //go right
            }
            else right = mid-1; //go left
        }
        System.out.println(index);
    }
}
