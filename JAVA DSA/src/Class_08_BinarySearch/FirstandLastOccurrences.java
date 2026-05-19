package Class_08_BinarySearch;

public class FirstandLastOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int target = 3;
        int left = 0, right = arr.length - 1, index1 = -1, index2 = -1;
        //first occurrence
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                index1 = mid;
                right = mid-1; //go left
            }
            else if(arr[mid]>target){
                right = mid-1; //go left
            }
            else left = mid + 1; //go right
        }
        //last occurrence
        left = 0; right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                index2 = mid;
                left = mid + 1; //go right
            }
            else if(arr[mid]>target){
                right = mid-1; //go left
            }
            else left = mid + 1; //go right
        }
        System.out.println(index1+" "+index2);
    }
}
