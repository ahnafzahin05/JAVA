package Class_08_BinarySearch;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int target = 7, index= -1;
        int left=0, right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==target){
                index = mid; // Store this occurrence
                left = mid + 1; // Continue searching right
            }
            else if(arr[mid]>target){ //go left
                right = mid-1;
            }
            else if(arr[mid]<target){ //go right
                left = mid+1;
            }
        }
        System.out.println(index);
    }

}
