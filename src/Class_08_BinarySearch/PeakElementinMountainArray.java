package Class_08_BinarySearch;

public class PeakElementinMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,20,15,};
        int left=0, right=arr.length-1, index=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]<arr[mid+1]){
                left = mid+1; //go right
            }
            else if(arr[mid]>arr[mid+1]){
                right = mid-1; //go left
            }
        }
    }
}
